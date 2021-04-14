package org.example.spring.infrastructures.mysql.patient.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class)
public interface TPatientGroupMapper extends IBaseMapper<TPatientGroup> {
    boolean existById(Long id);
}