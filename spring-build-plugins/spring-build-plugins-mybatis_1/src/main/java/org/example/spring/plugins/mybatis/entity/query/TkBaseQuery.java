package org.example.spring.plugins.mybatis.entity.query;

import com.gitee.denger.mybatis.example.ext.ExampleCriteriaValueFactory;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.analytical.IExampleCriteriaValue;
import com.gitee.denger.mybatis.example.ext.annotation.ExampleAnalytical;
import com.gitee.denger.mybatis.example.ext.util.ClassUtils;
import com.gitee.denger.mybatis.example.ext.util.SimpleReflectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public abstract class TkBaseQuery<T> extends EBaseQuery<Example> implements MybatisExampleForTk<T, Example> {
    @Override
    public Example toExample() {

        Class<?> thisClass = this.getClass();
        Type[] actualTypeArguments = ClassUtils.getGenericInterfaceActualTypeArguments(thisClass, MybatisExampleForTk.class);
        if (null == actualTypeArguments) {
            throw new IllegalArgumentException(String.format("%s比需填写%s的泛型", thisClass.getName(), MybatisExampleForTk.class.getSimpleName()));
        } else {
            Class<T> entityClass = (Class)actualTypeArguments[0];
            Class<Example> exampleClass = Example.class;
            Example example = ClassUtils.newInstance(exampleClass, new Object[]{entityClass});
            Object exampleCriteria = SimpleReflectionUtils.invokeMethod(exampleClass, example, "createCriteria");
            SimpleReflectionUtils.doWithFields(thisClass, (field) -> {
                field.setAccessible(true);
                Object fieldValue = SimpleReflectionUtils.getField(field, this);
                if (null != fieldValue) {
                    Annotation[] annotations = field.getAnnotations();
                    Annotation[] var5 = annotations;
                    int var6 = annotations.length;

                    for(int var7 = 0; var7 < var6; ++var7) {
                        Annotation annotation = var5[var7];
                        Class<? extends Annotation> annotationType = annotation.annotationType();
                        ExampleAnalytical setValueClass = (ExampleAnalytical)annotationType.getAnnotation(ExampleAnalytical.class);
                        if (null != setValueClass) {
                            IExampleCriteriaValue exampleCriteriaValue = ExampleCriteriaValueFactory.getExampleCriteriaValue(setValueClass.value());
                            String property = (String)SimpleReflectionUtils.invokeMethod(annotationType, annotation, "property");
                            String fieldName;
                            if (null != property && !"".equals(property)) {
                                fieldName = property;
                            } else {
                                fieldName = field.getName();
                            }

                            exampleCriteriaValue.setForTk(annotation, exampleCriteria, fieldName, fieldValue);
                            break;
                        }
                    }

                }
            });
            return example;
        }

    }
}