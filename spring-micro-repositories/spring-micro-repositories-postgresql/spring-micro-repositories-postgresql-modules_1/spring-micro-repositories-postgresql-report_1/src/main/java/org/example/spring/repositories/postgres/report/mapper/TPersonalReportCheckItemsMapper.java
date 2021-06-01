package org.example.spring.repositories.postgres.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.postgres.report.table.po.TPersonalReportCheckItems;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPersonalReportCheckItemsMapper extends IBaseMapper<TPersonalReportCheckItems> {
}