package org.example.spring.infrastructures.mysql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TDepartmentMapper extends IBaseMapper<TDepartment> {
}