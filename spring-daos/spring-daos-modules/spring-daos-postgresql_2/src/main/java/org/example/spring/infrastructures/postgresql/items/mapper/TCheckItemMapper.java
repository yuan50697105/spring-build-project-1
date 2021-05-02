package org.example.spring.infrastructures.postgresql.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.items.table.po.TCheckItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCheckItemMapper extends IBaseMapper<TCheckItem> {
}