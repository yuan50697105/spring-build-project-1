package org.example.spring.infrastructures.mysql.items.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.items.table.po.TCheckItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class,eviction = MybatisRedisCache.class)
public interface TCheckItemMapper extends IBaseMapper<TCheckItem> {
}