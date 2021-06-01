package org.example.spring.repositories.mssql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.mssql.customer.table.po.TSalesRecord;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TSalesRecordMapper extends IBaseMapper<TSalesRecord> {
}