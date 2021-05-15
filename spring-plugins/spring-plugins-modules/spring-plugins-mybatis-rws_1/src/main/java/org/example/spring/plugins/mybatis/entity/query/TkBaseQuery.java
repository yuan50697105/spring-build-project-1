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
}