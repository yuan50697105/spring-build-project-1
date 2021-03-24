package org.example.modules.repository.mysql.entity.vo;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountVo extends IBaseVo {
    @NotEmpty(groups = {Update.class})
    private Long id;
    @NotEmpty
    private AccountInfo account;
    @NotEmpty
    private Set<RoleInfo> roles;

    public List<RoleInfo> getRoles() {
        if (ObjectUtil.isNotEmpty(roles)) {
            return new ArrayList<>(roles);
        } else {
            return null;
        }
    }

    public List<Long> getRoleIds() {
        return getRoles().stream().map(RoleInfo::getId).collect(Collectors.toList());
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AccountInfo {
        @NotBlank(groups = {Save.class})
        private String username;
        @NotBlank(groups = {Save.class})
        private String name;
        @NotBlank(groups = {Save.class})
        private String password;
        private Integer enabled;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RoleInfo {
        @NotBlank(groups = {Save.class})
        private Long id;
        private String name;
    }
}