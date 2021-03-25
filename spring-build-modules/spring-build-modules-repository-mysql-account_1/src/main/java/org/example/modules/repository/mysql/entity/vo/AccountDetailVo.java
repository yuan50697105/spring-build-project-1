package org.example.modules.repository.mysql.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
public class AccountDetailVo {
    private Long id;
    private UserInfo user;
    private Set<RoleInfo> roles;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserInfo {
        @ApiModelProperty("账号")
        private String username;
        @ApiModelProperty("姓名")
        private String name;
        @ApiModelProperty("密码")
        private String password;
        @ApiModelProperty(value = "启用状态", notes = "0 停用，1 启用")
        private Integer enabled;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RoleInfo {
        @ApiModelProperty("角色ID")
        private Long id;
        @ApiModelProperty("角色名称")
        private String name;
    }
}