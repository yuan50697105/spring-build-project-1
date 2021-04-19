package org.example.spring.models.auth.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentFormVo extends IBaseVo {
    private static final long serialVersionUID = -4189657877498124246L;
    private DepartmentVo department;
    private List<RoleVo> roles;

    @JsonIgnore
    public List<Long> getRoleIds() {
        return roles.stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }

    @JsonIgnore
    public List<String> getRoleName() {
        return roles.stream().map(TRole::getName).collect(Collectors.toList());
    }

}