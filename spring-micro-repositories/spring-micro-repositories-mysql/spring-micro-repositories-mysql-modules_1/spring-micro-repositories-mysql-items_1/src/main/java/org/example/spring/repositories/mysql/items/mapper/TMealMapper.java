package org.example.spring.repositories.mysql.items.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.mysql.items.table.po.TMeal;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TMealMapper extends IBaseMapper<TMeal> {
}