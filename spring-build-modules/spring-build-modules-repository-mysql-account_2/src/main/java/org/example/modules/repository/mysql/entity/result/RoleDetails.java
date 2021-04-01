package org.example.modules.repository.mysql.entity.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author yuane
 */
@Data
public class RoleDetails implements Serializable {
    private Long id;
    private RoleInfo role;
    private Set<PermissionInfo> permissions;


    @Data
    @ApiModel("角色信息")
    public static class RoleInfo {
        private Long id;
        @ApiModelProperty("角色名称")
        private String name;
    }

    @Data
    public static class PermissionInfo {
        private Long id;
        private String name;
        private String type;
    }


}