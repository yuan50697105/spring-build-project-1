package org.example.spring.daos.mysql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.report.table.po.TTemplateInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TTemplateInfoMapper extends IBaseMapper<TTemplateInfo> {
}