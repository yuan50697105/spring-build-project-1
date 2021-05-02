package org.example.spring.infrastructures.mysql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.report.table.po.TReportInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TReportInfoMapper extends IBaseMapper<TReportInfo> {
}