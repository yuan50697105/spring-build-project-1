package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleBuilder {
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TRole createRole(RoleFormVo.RoleInfo role);
}