package org.example.spring.repositories.commons.entity.auth.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

/**
 * t_role_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.repositories.mysql.auth-table-po-TRolePermission")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class RolePermissionQuery extends ICommonsQuery {
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
    private Long permissionId;
}