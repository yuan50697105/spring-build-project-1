package org.example.modules.repository.mysql.entity.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDetailResult extends IBaseVo {
    private RoleInfo role;
    private Set<PermissionInfo> permissions;


    @Data
    @ApiModel("角色信息")
    public static class RoleInfo {
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