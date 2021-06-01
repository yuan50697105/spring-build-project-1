package org.example.spring.repositories.mssql.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.mssql.items.table.po.TMealFeeItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TMealFeeItemMapper extends IBaseMapper<TMealFeeItem> {
}