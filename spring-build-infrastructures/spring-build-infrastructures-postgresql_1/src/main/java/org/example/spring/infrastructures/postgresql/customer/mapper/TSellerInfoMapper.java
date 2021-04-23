package org.example.spring.infrastructures.postgresql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.customer.table.po.TSellerInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TSellerInfoMapper extends IBaseMapper<TSellerInfo> {
}