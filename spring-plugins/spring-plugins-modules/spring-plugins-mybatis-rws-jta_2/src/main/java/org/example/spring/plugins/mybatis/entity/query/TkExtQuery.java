package org.example.spring.plugins.mybatis.entity.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

@SuppressWarnings("rawtypes")
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class TkExtQuery<T> extends TkBaseQuery<T> implements MybatisExampleForTk<T, Example> {
    public abstract Wrapper<T> wrapper();

    public LambdaQueryWrapper<T> lambdaQueryWrapper() {
        return Wrappers.lambdaQuery((Class<T>) ReflectionKit.getSuperClassGenericType(getClass(), 0));
    }

    public QueryWrapper<T> queryWrapper() {
        return Wrappers.query();
    }
}