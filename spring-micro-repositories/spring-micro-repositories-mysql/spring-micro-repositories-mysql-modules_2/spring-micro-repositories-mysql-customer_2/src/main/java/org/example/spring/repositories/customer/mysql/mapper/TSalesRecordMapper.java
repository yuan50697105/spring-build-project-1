package org.example.spring.repositories.customer.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.customer.mysql.table.po.TSalesRecord;

@Mapper
public interface TSalesRecordMapper extends IBaseMapper<TSalesRecord> {
}