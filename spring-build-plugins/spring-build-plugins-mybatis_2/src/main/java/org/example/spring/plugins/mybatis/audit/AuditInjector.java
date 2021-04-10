package org.example.spring.plugins.mybatis.audit;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.github.Generator;
import lombok.AllArgsConstructor;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

@Component
@AllArgsConstructor
public class AuditInjector implements MetaObjectHandler {

    public static final String CREATE_DATE = "createDate";
    public static final String UPDATE_DATE = "updateDate";
    public static final String ID = "id";
    private final Generator generator;

    @Override
    public void insertFill(MetaObject metaObject) {
        setFieldValByName(ID, generator.nextId(), metaObject);
        setFieldValByName(CREATE_DATE, new Date(), metaObject);
        setFieldValByName(UPDATE_DATE, new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName(UPDATE_DATE, new Date(), metaObject);
    }

    private void fillValue(MetaObject metaObject, String fieldName, Supplier<Object> valueSupplier) {
        if (!metaObject.hasGetter(fieldName)) {
            return;
        }
        Object sidObj = metaObject.getValue(fieldName);
        if (sidObj == null && metaObject.hasSetter(fieldName) && valueSupplier != null) {
            setFieldValByName(fieldName, valueSupplier.get(), metaObject);
        }
    }

    private Object getDateValue(Class<?> setterType) {
        if (Date.class.equals(setterType)) {
            return new Date();
        } else if (LocalDateTime.class.equals(setterType)) {
            return LocalDateTime.now();
        } else if (Long.class.equals(setterType)) {
            return System.currentTimeMillis();
        }
        return null;
    }

}