package org.example.spring.infrastructures.clickhouse.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.clickhouse.auth.table.po.TRole;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class ,readWrite = false,blocking = true,flushInterval = 2000)
public interface TRoleMapper extends IBaseMapper<TRole> {
}