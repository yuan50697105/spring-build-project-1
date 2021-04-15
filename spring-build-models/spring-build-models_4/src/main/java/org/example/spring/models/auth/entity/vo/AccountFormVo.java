package org.example.spring.models.auth.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountFormVo extends IBaseVo {
    private static final long serialVersionUID = 587049309938653406L;
    private AccountVo account;
    private Set<RoleVo> roles;

    @JsonIgnore
    public String getUsername() {
        return Optional.ofNullable(account).map(TUser::getUsername).orElse(null);
    }

    @JsonIgnore
    public String getName() {
        return Optional.ofNullable(account).map(TUser::getName).orElse(null);
    }

    @JsonIgnore
    public List<Long> getRoleIds() {
        return roles.stream().map(IBaseEntity::getId).collect(Collectors.toList());
    }

    @JsonIgnore
    public List<String> getRoleName() {
        return roles.stream().map(TRole::getName).collect(Collectors.toList());
    }

}