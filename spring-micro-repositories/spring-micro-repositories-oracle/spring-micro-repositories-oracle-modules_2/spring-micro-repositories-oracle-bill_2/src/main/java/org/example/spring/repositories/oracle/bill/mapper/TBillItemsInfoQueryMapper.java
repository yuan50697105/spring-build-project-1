package org.example.spring.repositories.oracle.bill.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.repositories.oracle.bill.table.po.TBillItemsInfo;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class)
public interface TBillItemsInfoQueryMapper {
    List<TBillItemsInfo> queryListBySubId(@Param("subId") Long subId);

    List<TBillItemsInfo> queryListByBillId(@Param("billId") Long billId);
}
