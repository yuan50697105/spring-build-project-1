package org.example.modules.repository.mysql.entity.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.entity.po.TRole;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role extends TRole implements Serializable {
    @ApiModelProperty("角色ID")
    private Long id;
    @ApiModelProperty("角色名称")
    private String name;
}