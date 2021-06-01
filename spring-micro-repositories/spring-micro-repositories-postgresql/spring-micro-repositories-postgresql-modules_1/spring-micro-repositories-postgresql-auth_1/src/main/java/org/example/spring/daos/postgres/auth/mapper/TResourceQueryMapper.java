package org.example.spring.daos.postgres.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgres.auth.table.po.TResource;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TResourceQueryMapper {
    List<TResource> queryListByRoleId(Long roleId);

    List<TResource> queryListByUserId(Long userId);
}
