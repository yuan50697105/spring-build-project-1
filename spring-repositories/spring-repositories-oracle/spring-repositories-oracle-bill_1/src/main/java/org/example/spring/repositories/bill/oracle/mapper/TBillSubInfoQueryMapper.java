package org.example.spring.repositories.bill.oracle.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.repositories.bill.oracle.table.po.TBillSubInfo;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class)
public interface TBillSubInfoQueryMapper {
    List<TBillSubInfo> queryDetailsListByBillId(@Param("billId") Long billId);
}
