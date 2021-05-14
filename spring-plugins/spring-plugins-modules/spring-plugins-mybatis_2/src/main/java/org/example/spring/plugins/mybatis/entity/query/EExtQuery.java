package org.example.spring.plugins.mybatis.entity.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class EExtQuery<E> extends EBaseQuery<E> implements MybatisExample<E> {
    public abstract <T> Wrapper<T> wrapper();
}