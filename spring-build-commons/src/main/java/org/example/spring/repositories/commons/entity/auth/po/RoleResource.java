package org.example.spring.repositories.commons.entity.auth.po;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * t_role_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.repositories.mysql.auth-table-po-TRoleResource")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class RoleResource extends ICommonsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    private Long roleId;
    /**
     * permissionId
     */
    @ApiModelProperty(value = "permissionId")
    private Long resourceId;
}