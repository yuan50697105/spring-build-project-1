package org.example.spring.repositories.mssql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.mssql.report.table.po.TPersonalReportInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPersonalReportInfoMapper extends IBaseMapper<TPersonalReportInfo> {
}