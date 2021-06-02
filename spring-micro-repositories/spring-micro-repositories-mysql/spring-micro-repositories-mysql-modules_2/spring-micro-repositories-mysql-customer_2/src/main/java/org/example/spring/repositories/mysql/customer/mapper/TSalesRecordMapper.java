package org.example.spring.repositories.mysql.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mysql.customer.table.po.TSalesRecord;

@Mapper
public interface TSalesRecordMapper extends IBaseMapper<TSalesRecord> {
}