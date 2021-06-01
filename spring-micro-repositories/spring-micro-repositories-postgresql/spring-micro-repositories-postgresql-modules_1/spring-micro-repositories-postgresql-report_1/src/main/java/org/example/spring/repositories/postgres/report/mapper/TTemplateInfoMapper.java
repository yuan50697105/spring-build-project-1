package org.example.spring.repositories.postgres.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.postgres.report.table.po.TTemplateInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TTemplateInfoMapper extends IBaseMapper<TTemplateInfo> {
}