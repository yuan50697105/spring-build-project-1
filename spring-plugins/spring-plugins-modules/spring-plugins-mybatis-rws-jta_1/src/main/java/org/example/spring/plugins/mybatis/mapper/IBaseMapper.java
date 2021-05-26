package org.example.spring.plugins.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beyond.mybatisplus.batch.CustomBaseMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author yuane
 */
@RegisterMapper
public interface IBaseMapper<T> extends Mapper<T>, BaseMapper<T>, CustomBaseMapper<T> {
}
