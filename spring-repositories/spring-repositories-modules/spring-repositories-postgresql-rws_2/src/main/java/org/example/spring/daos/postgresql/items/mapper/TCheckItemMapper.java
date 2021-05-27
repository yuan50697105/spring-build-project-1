package org.example.spring.daos.postgresql.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.items.table.po.TCheckItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCheckItemMapper extends IBaseMapper<TCheckItem> {
}