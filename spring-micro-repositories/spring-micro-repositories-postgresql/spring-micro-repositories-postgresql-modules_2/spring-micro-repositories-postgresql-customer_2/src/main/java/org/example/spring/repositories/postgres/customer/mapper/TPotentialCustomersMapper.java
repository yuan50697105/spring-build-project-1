package org.example.spring.repositories.postgres.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.postgres.customer.table.po.TPotentialCustomers;

@Mapper
public interface TPotentialCustomersMapper extends IBaseMapper<TPotentialCustomers> {
}