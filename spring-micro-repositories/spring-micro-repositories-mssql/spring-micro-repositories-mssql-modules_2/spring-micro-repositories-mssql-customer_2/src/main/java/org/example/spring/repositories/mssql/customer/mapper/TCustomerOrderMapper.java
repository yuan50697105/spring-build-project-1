package org.example.spring.repositories.mssql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mssql.customer.table.po.TCustomerOrder;

@Mapper
public interface TCustomerOrderMapper extends IBaseMapper<TCustomerOrder> {
}