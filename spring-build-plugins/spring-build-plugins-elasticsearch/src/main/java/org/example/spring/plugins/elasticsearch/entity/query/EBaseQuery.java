package org.example.spring.plugins.elasticsearch.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class EBaseQuery<E> extends IBaseQuery implements MybatisExample<E>{
}