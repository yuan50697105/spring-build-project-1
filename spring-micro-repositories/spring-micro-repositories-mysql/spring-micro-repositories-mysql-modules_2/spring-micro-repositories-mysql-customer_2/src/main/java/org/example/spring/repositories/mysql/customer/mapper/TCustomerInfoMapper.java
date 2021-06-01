package org.example.spring.repositories.mysql.customer.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerInfo;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TCustomerInfoMapper extends IBaseMapper<TCustomerInfo> {
}