package org.example.spring.repositories.items.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.items.mysql.table.po.TMeal;

@Mapper
public interface TMealMapper extends IBaseMapper<TMeal> {
}