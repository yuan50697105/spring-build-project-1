package org.example.spring.repositories.report.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.report.mysql.table.po.TPersonalReportCheckItems;

@Mapper
public interface TPersonalReportCheckItemsMapper extends IBaseMapper<TPersonalReportCheckItems> {
}