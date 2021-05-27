package org.example.spring.daos.es.auth.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_role_permission
 */
@ApiModel(value = "org-example-spring-daos-mysql-auth-table-po-TRolePermission")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ERolePermissionQuery extends IBaseQuery {
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