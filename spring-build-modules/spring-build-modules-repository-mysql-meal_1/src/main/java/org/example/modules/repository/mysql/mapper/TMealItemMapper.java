package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.table.po.TMealItem;
import org.example.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TMealItemMapper extends IBaseMapper<TMealItem> {
}