package org.example.spring.daos.mysql.department.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.department.table.po.TCheckDepartment;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCheckDepartmentMapper extends IBaseMapper<TCheckDepartment> {
}