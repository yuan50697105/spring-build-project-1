package org.example.spring.repositories.postgres.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.postgres.customer.table.po.TCustomerOrder;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCustomerOrderMapper extends IBaseMapper<TCustomerOrder> {
}