package org.example.spring.daos.mssql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mssql.customer.table.po.TCustomerOrder;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCustomerOrderMapper extends IBaseMapper<TCustomerOrder> {
}