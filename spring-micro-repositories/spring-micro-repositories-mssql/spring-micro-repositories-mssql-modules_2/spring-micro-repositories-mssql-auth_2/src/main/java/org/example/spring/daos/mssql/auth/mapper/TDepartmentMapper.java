package org.example.spring.daos.mssql.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.daos.mssql.auth.table.po.TDepartment;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TDepartmentMapper extends IBaseMapper<TDepartment> {
    boolean existChildByPIds(@Param("ids") List<Long> ids);

    Integer validateDelete(@Param("ids") List<Long> ids);
}