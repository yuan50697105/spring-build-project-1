package org.example.spring.infrastructures.postgresql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.auth.table.po.TRole;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TRoleMapper extends IBaseMapper<TRole> {
}