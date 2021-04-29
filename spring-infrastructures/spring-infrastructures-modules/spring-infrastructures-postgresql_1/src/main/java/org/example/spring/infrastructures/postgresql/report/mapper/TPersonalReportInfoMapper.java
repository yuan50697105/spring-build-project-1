package org.example.spring.infrastructures.postgresql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.report.table.po.TPersonalReportInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPersonalReportInfoMapper extends IBaseMapper<TPersonalReportInfo> {
}