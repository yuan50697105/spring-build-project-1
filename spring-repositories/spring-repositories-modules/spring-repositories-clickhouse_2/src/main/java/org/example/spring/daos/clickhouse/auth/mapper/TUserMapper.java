package org.example.spring.daos.clickhouse.auth.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.daos.clickhouse.auth.table.po.TUser;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, flushInterval = 2000)
public interface TUserMapper extends IBaseMapper<TUser> {
    boolean existByUsername(String username);

    int updateStatusByIds(@Param("status") String status, @Param("ids") List<Long> ids);
}