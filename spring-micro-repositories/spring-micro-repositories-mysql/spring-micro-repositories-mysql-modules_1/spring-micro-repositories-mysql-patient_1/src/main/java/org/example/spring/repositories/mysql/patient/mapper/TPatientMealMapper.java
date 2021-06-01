package org.example.spring.repositories.mysql.patient.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.mysql.patient.table.po.TPatientMeal;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.mysql.patient.table.po.TPatientMeal;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TPatientMealMapper extends IBaseMapper<TPatientMeal> {
}