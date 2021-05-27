package org.example.spring.daos.clickhouse.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.daos.clickhouse.auth.table.po.TDepartmentRole;
import org.example.spring.daos.clickhouse.auth.table.po.TRole;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TDepartmentRoleMapper extends IBaseMapper<TDepartmentRole> {
    List<TRole> listRolesByDepartmentId(@Param("departmentId") Long departmentId);
}