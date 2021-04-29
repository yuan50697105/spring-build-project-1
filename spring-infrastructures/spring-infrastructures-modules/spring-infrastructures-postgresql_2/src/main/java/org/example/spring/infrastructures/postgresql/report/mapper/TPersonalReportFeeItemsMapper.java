package org.example.spring.infrastructures.postgresql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.report.table.po.TPersonalReportFeeItems;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPersonalReportFeeItemsMapper extends IBaseMapper<TPersonalReportFeeItems> {
}