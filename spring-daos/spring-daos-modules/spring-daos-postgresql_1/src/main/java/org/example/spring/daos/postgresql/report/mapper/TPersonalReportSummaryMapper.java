package org.example.spring.daos.postgresql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.report.table.po.TPersonalReportSummary;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPersonalReportSummaryMapper extends IBaseMapper<TPersonalReportSummary> {
}