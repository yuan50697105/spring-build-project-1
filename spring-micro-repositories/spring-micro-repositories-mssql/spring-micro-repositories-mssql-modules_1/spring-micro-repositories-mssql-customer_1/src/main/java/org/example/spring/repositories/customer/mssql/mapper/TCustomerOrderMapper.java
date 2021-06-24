package org.example.spring.repositories.customer.mssql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerOrder;

@Mapper
public interface TCustomerOrderMapper extends IBaseMapper<TCustomerOrder> {
}