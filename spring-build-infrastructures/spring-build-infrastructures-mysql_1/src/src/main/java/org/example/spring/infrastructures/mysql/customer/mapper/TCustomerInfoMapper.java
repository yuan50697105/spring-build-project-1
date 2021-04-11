package org.example.spring.infrastructures.mysql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCustomerInfoMapper extends IBaseMapper<TCustomerInfo> {
}