package org.example.spring.daos.mssql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mssql.report.table.po.TPersonalReportSummary;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPersonalReportSummaryMapper extends IBaseMapper<TPersonalReportSummary> {
}