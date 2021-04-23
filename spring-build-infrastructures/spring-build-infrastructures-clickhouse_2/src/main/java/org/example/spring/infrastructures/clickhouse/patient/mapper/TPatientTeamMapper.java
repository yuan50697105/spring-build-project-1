package org.example.spring.infrastructures.clickhouse.patient.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientTeam;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

/**
 * @author yuane
 */
@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TPatientTeamMapper extends IBaseMapper<TPatientTeam> {
    boolean existById(Long id);
}