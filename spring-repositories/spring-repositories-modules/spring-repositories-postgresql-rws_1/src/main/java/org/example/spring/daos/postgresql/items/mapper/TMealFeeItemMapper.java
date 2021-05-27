package org.example.spring.daos.postgresql.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.items.table.po.TMealFeeItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TMealFeeItemMapper extends IBaseMapper<TMealFeeItem> {
}