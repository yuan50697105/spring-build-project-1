package org.example.spring.infrastructures.mysql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TRolePermission;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TRolePermissionMapper extends IBaseMapper<TRolePermission> {
}