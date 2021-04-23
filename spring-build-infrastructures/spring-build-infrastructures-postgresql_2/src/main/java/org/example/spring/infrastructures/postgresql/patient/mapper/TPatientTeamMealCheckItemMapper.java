package org.example.spring.infrastructures.postgresql.patient.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

/**
 * @author yuane
 */
@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TPatientTeamMealCheckItemMapper extends IBaseMapper<TPatientTeamMealCheckItem> {
}