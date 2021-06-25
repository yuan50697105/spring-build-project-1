package org.example.spring.repositories.report.postgres.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.report.postgres.table.po.TPersonalReportInfo;

@Mapper
public interface TPersonalReportInfoMapper extends IBaseMapper<TPersonalReportInfo> {
}