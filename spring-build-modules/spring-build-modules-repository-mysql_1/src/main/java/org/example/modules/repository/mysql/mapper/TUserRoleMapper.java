package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;import org.example.modules.repository.mysql.entity.TUserRole;
import org.example.plugins.mybatis.mapper.IBaseMapper;

import java.util.List;

@Mapper
public interface TUserRoleMapper extends IBaseMapper<TUserRole> {
}