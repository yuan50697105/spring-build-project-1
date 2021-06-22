package org.example.spring.repositories.aggregation.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.aggregation.auth.table.po.TResource;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TResourceMapper extends IBaseMapper<TResource> {
    boolean existChidByPids(@Param("ids") List<Long> ids);

    Integer validateDelete(@Param("ids") List<Long> ids, @Param("types") String... types);
}