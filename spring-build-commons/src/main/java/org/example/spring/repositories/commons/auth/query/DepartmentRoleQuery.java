package org.example.spring.repositories.commons.auth.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

/**
 * t_department_role
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.repositories.mysql.auth-table-po-TDepartmentRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRoleQuery extends ICommonsQuery {
    private static final long serialVersionUID = 1L;
    /**
     * departmentId
     */
    @ApiModelProperty(value = "departmentId")
    private Long departmentId;

    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    private Long roleId;
}