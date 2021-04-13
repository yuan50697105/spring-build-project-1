package org.example.spring.infrastructures.mysql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;
import org.example.spring.infrastructures.mysql.auth.table.po.TResource;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
public interface TResourceMapper extends IBaseMapper<TResource> {
    boolean existChidByPids(@Param("ids") List<Long> ids);
}