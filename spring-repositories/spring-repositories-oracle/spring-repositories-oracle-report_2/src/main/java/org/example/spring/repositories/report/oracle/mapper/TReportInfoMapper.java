package org.example.spring.repositories.report.oracle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.report.oracle.table.po.TReportInfo;

@Mapper
public interface TReportInfoMapper extends IBaseMapper<TReportInfo> {
}