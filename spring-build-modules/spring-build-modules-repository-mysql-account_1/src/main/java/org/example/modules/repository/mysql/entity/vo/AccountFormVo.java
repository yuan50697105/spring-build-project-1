package org.example.modules.repository.mysql.entity.vo;

import cn.hutool.core.collection.CollUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
public class AccountFormVo extends IBaseVo {
    @NotEmpty(groups = {Update.class})
    private Long id;
    @ApiModelProperty("账号信息")
    private AccountFormVo.UserInfo user;
    @NotEmpty
    @ApiModelProperty("角色信息")
    private Set<RoleInfo> roles;

    public AccountFormVo() {
    }

    public AccountFormVo(@NotEmpty AccountFormVo.UserInfo user, @NotEmpty Set<RoleInfo> roles) {
        this.user = user;
        this.roles = roles;
    }

    public AccountFormVo(@NotEmpty(groups = {Update.class}) Long id, @NotEmpty AccountFormVo.UserInfo user, @NotEmpty Set<RoleInfo> roles) {
        this.id = id;
        this.user = user;
        this.roles = roles;
    }

    public List<RoleInfo> getRolesList() {
        return CollUtil.emptyIfNull(new ArrayList<>(roles));
    }

    public List<Long> getRoleIds() {
        return getRolesList().stream().map(RoleInfo::getId).collect(Collectors.toList());
    }

    public List<String> getRoleNames() {
        return getRolesList().stream().map(RoleInfo::getName).collect(Collectors.toList());
    }

    public String getUsername() {
        return Optional.ofNullable(user).map(UserInfo::getUsername).orElse(null);
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserInfo {
        @NotBlank(groups = {Save.class})
        @ApiModelProperty("账号")
        private String username;
        @NotBlank(groups = {Save.class})
        @ApiModelProperty("姓名")
        private String name;
        @NotBlank(groups = {Save.class})
        @ApiModelProperty("密码")
        private String password;
        @ApiModelProperty(value = "启用状态", notes = "0 停用，1 启用")
        private Integer enabled;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RoleInfo {
        @NotBlank(groups = {Save.class})
        @ApiModelProperty("角色ID")
        private Long id;
        @ApiModelProperty("角色名称")
        private String name;
    }
}