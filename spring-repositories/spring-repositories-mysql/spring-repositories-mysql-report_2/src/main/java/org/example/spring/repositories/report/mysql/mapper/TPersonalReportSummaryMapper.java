package org.example.spring.repositories.report.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.report.mysql.table.po.TPersonalReportSummary;

@Mapper
public interface TPersonalReportSummaryMapper extends IBaseMapper<TPersonalReportSummary> {
}