package org.example.spring.repositories.mysql.report.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.report.table.po.TTemplateInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mysql.report.table.po.TTemplateInfo;

@Mapper
public interface TTemplateInfoMapper extends IBaseMapper<TTemplateInfo> {
}