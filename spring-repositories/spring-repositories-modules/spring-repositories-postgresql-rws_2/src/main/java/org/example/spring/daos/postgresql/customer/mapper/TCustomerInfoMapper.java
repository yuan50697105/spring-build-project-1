package org.example.spring.daos.postgresql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.customer.table.po.TCustomerInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCustomerInfoMapper extends IBaseMapper<TCustomerInfo> {
}