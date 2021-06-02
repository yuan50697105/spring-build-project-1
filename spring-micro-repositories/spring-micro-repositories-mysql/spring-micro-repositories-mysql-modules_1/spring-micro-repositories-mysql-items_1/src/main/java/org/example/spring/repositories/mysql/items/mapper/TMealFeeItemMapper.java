package org.example.spring.repositories.mysql.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mysql.items.table.po.TMealFeeItem;

@Mapper
public interface TMealFeeItemMapper extends IBaseMapper<TMealFeeItem> {
}