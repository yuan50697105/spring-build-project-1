package org.example.modules.repository.mysql.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.account.entity.TUser;
import org.example.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TUserMapper extends IBaseMapper<TUser> {
}