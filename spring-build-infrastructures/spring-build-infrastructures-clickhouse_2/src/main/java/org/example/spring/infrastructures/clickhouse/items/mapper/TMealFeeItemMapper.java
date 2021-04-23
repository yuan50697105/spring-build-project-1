package org.example.spring.infrastructures.clickhouse.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.clickhouse.items.table.po.TMealFeeItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TMealFeeItemMapper extends IBaseMapper<TMealFeeItem> {
}