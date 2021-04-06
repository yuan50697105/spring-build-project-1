package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.table.po.TRole;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TRoleMapper extends IBaseMapper<TRole> {

    boolean existByRoleName(String roleName);
}