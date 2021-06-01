package org.example.spring.repositories.mysql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.customer.table.po.TCustomerOrder;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerOrder;

@Mapper
public interface TCustomerOrderMapper extends IBaseMapper<TCustomerOrder> {
}