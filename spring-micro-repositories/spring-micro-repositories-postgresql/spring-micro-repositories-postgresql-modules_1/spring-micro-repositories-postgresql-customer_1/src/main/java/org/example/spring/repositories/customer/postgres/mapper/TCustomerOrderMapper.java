package org.example.spring.repositories.customer.postgres.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerOrder;

@Mapper
public interface TCustomerOrderMapper extends IBaseMapper<TCustomerOrder> {
}