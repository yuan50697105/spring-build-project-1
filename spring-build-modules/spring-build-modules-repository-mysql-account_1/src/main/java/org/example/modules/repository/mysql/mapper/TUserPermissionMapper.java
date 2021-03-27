package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.entity.po.TPermission;

import java.util.List;

@Mapper
public interface TUserPermissionMapper {
    List<TPermission> getPermissionsByUserId(Long id);
}
