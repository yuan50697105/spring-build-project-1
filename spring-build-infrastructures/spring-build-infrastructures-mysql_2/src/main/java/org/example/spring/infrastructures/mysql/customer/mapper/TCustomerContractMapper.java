package org.example.spring.infrastructures.mysql.customer.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerContract;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class)
public interface TCustomerContractMapper extends IBaseMapper<TCustomerContract> {
}