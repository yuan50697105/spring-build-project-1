package org.example.spring.repositories.commons.auth.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * t_department
 */
@ApiModel(value = "org-example-spring-daos-mysql-org.example.spring.repositories.mysql.auth-table-po-TDepartment")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Department extends ICommonsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;
    /**
     * pid
     */
    @ApiModelProperty(value = "pid")
    private Long pid;
}