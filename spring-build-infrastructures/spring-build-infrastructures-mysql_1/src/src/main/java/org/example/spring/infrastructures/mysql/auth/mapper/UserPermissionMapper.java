package org.example.spring.infrastructures.mysql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;

import java.util.List;

@Mapper
public interface UserPermissionMapper {
    List<TPermission> listPermissionByUserId(Long userId);
}
