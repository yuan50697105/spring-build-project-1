package org.example.spring.daos.postgresql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.daos.postgresql.auth.table.po.TDepartmentRole;
import org.example.spring.daos.postgresql.auth.table.po.TRole;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
public interface TDepartmentRoleMapper extends IBaseMapper<TDepartmentRole> {
    List<TRole> listRolesByDepartmentId(@Param("departmentId") Long departmentId);
}