package org.example.spring.repositories.postgres.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.postgres.customer.table.po.TPotentialCustomers;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPotentialCustomersMapper extends IBaseMapper<TPotentialCustomers> {
}