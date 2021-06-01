package org.example.spring.repositories.mssql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.mssql.customer.table.po.TPotentialCustomers;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPotentialCustomersMapper extends IBaseMapper<TPotentialCustomers> {
}