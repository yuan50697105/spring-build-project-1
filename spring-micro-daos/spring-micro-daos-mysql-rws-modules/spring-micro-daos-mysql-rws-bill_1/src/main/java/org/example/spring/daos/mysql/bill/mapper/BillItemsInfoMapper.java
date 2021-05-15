package org.example.spring.daos.mysql.bill.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.bill.table.po.BillItemsInfo;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class)
public interface BillItemsInfoMapper extends IBaseMapper<BillItemsInfo> {
}
