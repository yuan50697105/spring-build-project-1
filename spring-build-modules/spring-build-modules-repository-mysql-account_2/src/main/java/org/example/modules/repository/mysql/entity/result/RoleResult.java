package org.example.modules.repository.mysql.entity.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleResult extends IBaseVo {
    @ApiModelProperty("角色名称")
    private String name;
    private List<PermissionResult> permissions;

}