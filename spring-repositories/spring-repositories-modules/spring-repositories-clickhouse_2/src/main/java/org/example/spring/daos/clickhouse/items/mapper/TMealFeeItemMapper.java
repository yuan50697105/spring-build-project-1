package org.example.spring.repositories.clickhouse.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.clickhouse.items.table.po.TMealFeeItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TMealFeeItemMapper extends IBaseMapper<TMealFeeItem> {
}