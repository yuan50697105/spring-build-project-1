package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TRoleMapper extends IBaseMapper<TRole> {

}