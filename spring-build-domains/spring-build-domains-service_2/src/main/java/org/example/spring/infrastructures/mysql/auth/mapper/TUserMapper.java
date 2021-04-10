package org.example.spring.infrastructures.mysql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TUserMapper extends IBaseMapper<TUser> {
    boolean existByUsername(String username);
}