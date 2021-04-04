package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.modules.repository.mysql.table.po.TPermission;

import java.util.List;

@Mapper
public interface TRolePermissionQueryMapper {
    List<TPermission> getRolePermissionsByRoleId(Long id);

    List<TPermission> getRolePermissionsByRoleIds(@Param("roleIds") List<Long> roleIds);
}
