package org.example.spring.daos.mysql.department.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
    * t_check_department_items
    */
@ApiModel(value="org-example-spring-daos-mysql-department-table-po-TCheckDepartmentItems")
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class TCheckDepartmentItems extends IBaseEntity implements Serializable {
    /**
    * code
    */
    @ApiModelProperty(value="code")
    private String code;

    /**
    * name
    */
    @ApiModelProperty(value="name")
    private String name;

    /**
    * checkItemId
    */
    @ApiModelProperty(value="checkItemId")
    private String checkItemId;
}