package org.example.spring.plugins.mybatis.audit;

import com.github.Generator;
import lombok.AllArgsConstructor;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.example.spring.plugins.mybatis.audit.annotation.CreateTime;
import org.example.spring.plugins.mybatis.audit.annotation.Id;
import org.example.spring.plugins.mybatis.audit.annotation.UpdateTime;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 21:34
 */
@Component
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
@AllArgsConstructor
public class CustomInterceptor implements Interceptor {
    private static final String ID = "id";
    private static final String CREATE_DATE = "createDate";
    private static final String UPDATE_DATE = "updateDate";
    private final Generator generator;
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement statement = ((MappedStatement) invocation.getArgs()[0]);
        SqlCommandType sqlCommandType = statement.getSqlCommandType();
        Object parameter = invocation.getArgs()[1];
        if (parameter instanceof MapperMethod.ParamMap) {
            parameter = ((MapperMethod.ParamMap<?>) parameter).get("et");
        }
        List<Field> fields = getAllField(parameter);
        for (Field field : fields) {
            if (field.getAnnotation(Id.class) != null || field.getName().equals(ID)) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, generator.nextId());
                }
            }
            if (field.getAnnotation(CreateTime.class) != null || field.getName().equals(CREATE_DATE)) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
            }
            if (field.getAnnotation(UpdateTime.class) != null || field.getName().equals(UPDATE_DATE)) {
                if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
            }

        }
        return invocation.proceed();
    }

//    @Override
//    public Object plugin(Object target) {
//        return Plugin.wrap(target, this);
//    }

    @Override
    public void setProperties(Properties properties) {

    }

    private List<Field> getAllField(Object object) {
        Class<?> type = object.getClass();
        Field[] declaredFields = type.getDeclaredFields();
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(declaredFields));
        while ((type = type.getSuperclass()) != null) {
            fields.addAll(Arrays.asList(type.getDeclaredFields()));
        }
        return fields;
    }
}