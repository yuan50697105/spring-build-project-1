package org.example.spring.infrastructures.postgresql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.auth.table.po.TResource;
import org.example.spring.infrastructures.postgresql.auth.table.po.TRoleResource;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
public interface TRoleResourceMapper extends IBaseMapper<TRoleResource> {
    List<TResource> listByRoleId(Long roleId);
}