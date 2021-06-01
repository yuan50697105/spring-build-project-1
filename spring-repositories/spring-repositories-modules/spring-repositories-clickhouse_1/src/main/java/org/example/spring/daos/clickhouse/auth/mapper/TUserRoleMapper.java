package org.example.spring.repositories.clickhouse.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.repositories.clickhouse.auth.table.po.TRole;
import org.example.spring.repositories.clickhouse.auth.table.po.TUserRole;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TUserRoleMapper extends IBaseMapper<TUserRole> {
    List<TRole> listByUserId(Long userId);
}