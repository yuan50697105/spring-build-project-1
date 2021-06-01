package org.example.spring.repositories.mssql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mssql.report.table.po.TPersonalReportFeeItems;

@Mapper
public interface TPersonalReportFeeItemsMapper extends IBaseMapper<TPersonalReportFeeItems> {
}