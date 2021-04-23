package org.example.spring.infrastructures.postgresql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;import org.example.spring.infrastructures.postgresql.auth.table.po.TRole;
import org.example.spring.infrastructures.postgresql.auth.table.po.TUserRole;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
public interface TUserRoleMapper extends IBaseMapper<TUserRole> {
    List<TRole> listByUserId(Long userId);
}