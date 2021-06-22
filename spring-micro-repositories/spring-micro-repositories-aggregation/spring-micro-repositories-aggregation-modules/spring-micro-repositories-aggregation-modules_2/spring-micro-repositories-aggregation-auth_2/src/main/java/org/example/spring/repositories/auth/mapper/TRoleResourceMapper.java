package org.example.spring.repositories.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.auth.table.po.TResource;
import org.example.spring.repositories.auth.table.po.TRoleResource;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TRoleResourceMapper extends IBaseMapper<TRoleResource> {
    List<TResource> listByRoleId(Long roleId);
}