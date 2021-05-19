package org.example.spring.daos.mysql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.customer.table.po.TSalesRecord;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TSalesRecordMapper extends IBaseMapper<TSalesRecord> {
}