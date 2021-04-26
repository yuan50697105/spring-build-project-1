package org.example.spring.infrastructures.mysql.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_department_role
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TDepartmentRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TDepartmentRole extends IBaseEntity implements Serializable {
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