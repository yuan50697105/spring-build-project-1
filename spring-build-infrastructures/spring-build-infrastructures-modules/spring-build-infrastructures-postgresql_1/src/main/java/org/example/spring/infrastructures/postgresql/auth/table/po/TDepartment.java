package org.example.spring.infrastructures.postgresql.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

@ApiModel(value = "org-example-spring-infrastructures-postgresql-auth-table-po-TDepartment")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TDepartment extends IBaseEntity implements Serializable {
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