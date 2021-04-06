package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.table.po.TUserRole;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TUserRoleMapper extends IBaseMapper<TUserRole> {
}