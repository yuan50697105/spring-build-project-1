package org.example.spring.infrastructures.postgresql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.infrastructures.postgresql.auth.table.po.TUser;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
public interface TUserMapper extends IBaseMapper<TUser> {
    boolean existByUsername(String username);

    Integer updateStatusByIds(@Param("status") String status, @Param("ids") List<Long> ids);
}