package org.example.spring.repositories.auth.mysql.mapper;

import com.github.liuanxin.caches.MybatisRedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;
import org.example.spring.repositories.auth.mysql.table.po.TUser;

import java.util.List;

@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, flushInterval = 2000)
public interface TUserMapper extends IBaseMapper<TUser> {
    boolean existByUsername(String username);

    Integer updateStatusByIds(@Param("status") String status, @Param("ids") List<Long> ids);
}