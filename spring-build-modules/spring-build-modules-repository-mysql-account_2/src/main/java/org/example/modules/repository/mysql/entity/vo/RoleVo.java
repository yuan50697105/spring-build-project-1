package org.example.modules.repository.mysql.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleVo extends IBaseVo {
    @ApiModelProperty("角色名称")
    private String name;

}