package org.example.spring.daos.postgres.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgres.customer.table.po.TSalesRecord;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TSalesRecordMapper extends IBaseMapper<TSalesRecord> {
}