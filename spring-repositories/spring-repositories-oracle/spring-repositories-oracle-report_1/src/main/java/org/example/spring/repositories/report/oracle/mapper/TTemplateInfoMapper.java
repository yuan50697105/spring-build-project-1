package org.example.spring.repositories.report.oracle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.report.oracle.table.po.TTemplateInfo;

@Mapper
public interface TTemplateInfoMapper extends IBaseMapper<TTemplateInfo> {
}