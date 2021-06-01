package org.example.spring.repositories.mssql.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mssql.items.table.po.TMeal;

@Mapper
public interface TMealMapper extends IBaseMapper<TMeal> {
}