package org.example.spring.daos.postgres.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgres.report.table.po.TTemplateInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TTemplateInfoMapper extends IBaseMapper<TTemplateInfo> {
}