package org.example.spring.daos.clickhouse.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.clickhouse.items.table.po.TMeal;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TMealMapper extends IBaseMapper<TMeal> {
}