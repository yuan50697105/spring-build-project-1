package org.example.spring.repositories.mysql.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.repositories.mysql.auth.table.po.TRole;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class, readWrite = false, blocking = true, flushInterval = 2000)
public interface TRoleQueryMapper {
    List<TRole> queryListByUserId(@Param("userId") Long userId);

    List<TRole> queryListByDepartmentId(@Param("departmentId") Long departmentId);
}
