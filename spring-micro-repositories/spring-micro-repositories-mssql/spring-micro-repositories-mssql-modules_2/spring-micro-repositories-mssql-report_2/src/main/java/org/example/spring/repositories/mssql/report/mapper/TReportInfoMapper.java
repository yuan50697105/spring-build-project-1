package org.example.spring.repositories.mssql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.mssql.report.table.po.TReportInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TReportInfoMapper extends IBaseMapper<TReportInfo> {
}