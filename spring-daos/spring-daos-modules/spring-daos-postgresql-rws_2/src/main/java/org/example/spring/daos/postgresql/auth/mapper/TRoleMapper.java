package org.example.spring.daos.postgresql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.auth.table.po.TRole;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TRoleMapper extends IBaseMapper<TRole> {
}