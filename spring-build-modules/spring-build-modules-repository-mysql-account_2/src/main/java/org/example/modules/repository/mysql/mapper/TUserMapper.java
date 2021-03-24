package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TUserMapper extends IBaseMapper<TUser> {
    boolean selectOneCountByUsername(String username);
}