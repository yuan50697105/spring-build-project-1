package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.table.po.TRole;

import java.util.List;

@Mapper
public interface TUserRoleQueryMapper {

    List<TRole> getRoleListByUserId(Long userId);

    List<TRole> getRolesByUsername(String username);
}
