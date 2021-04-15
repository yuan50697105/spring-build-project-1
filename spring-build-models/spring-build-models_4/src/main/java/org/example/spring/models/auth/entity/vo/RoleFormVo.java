package org.example.spring.models.auth.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.auth.entity.po.TResource;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleFormVo extends IBaseVo {
    private static final long serialVersionUID = 8065651975886340090L;
    private RoleVo role;
    private Set<ResourceVo> permissions;

    @JsonIgnore
    public List<Long> getPermissionIds() {
        return permissions.stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }

    @JsonIgnore
    public List<String> getPermissionName() {
        return permissions.stream().map(TResource::getName).collect(Collectors.toList());
    }
}