package org.example.spring.infrastructures.mysql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPermissionMapper extends IBaseMapper<TPermission> {
}