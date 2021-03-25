package org.example.modules.repository.mysql.entity.vo;

import cn.hutool.core.collection.CollUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleFormVo extends IBaseVo {
    @NotEmpty(groups = {Save.class})
    private RoleInfo role;
    @NotEmpty(groups = {Save.class})
    private Set<PermissionInfo> permissions;

    public String getRoleName() {
        return Optional.ofNullable(role).map(RoleInfo::getName).orElse(null);
    }


    @Data
    @ApiModel("角色信息")
    public static class RoleInfo {
        @NotBlank(groups = {Save.class})
        @ApiModelProperty("角色名称")
        private String name;
    }

    @Data
    public static class PermissionInfo {
        @NotEmpty(groups = {Save.class})
        private Long id;
        private String name;
    }

    public List<PermissionInfo> getPermissionList() {
        return CollUtil.emptyIfNull(new ArrayList<>(permissions));
    }

    public List<String> getPermissionNames() {
        return getPermissionList().stream().map(PermissionInfo::getName).collect(Collectors.toList());
    }

    public List<Long> getPermissionIds() {
        return getPermissionList().stream().map(PermissionInfo::getId).collect(Collectors.toList());
    }

}