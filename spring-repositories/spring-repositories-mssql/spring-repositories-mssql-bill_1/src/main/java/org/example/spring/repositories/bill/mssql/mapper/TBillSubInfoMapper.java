package org.example.spring.repositories.bill.mssql.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.bill.mssql.table.po.TBillSubInfo;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class)
public interface TBillSubInfoMapper extends IBaseMapper<TBillSubInfo> {
}
