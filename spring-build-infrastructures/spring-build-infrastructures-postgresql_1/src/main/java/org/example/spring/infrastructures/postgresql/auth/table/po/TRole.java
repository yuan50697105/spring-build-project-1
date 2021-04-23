package org.example.spring.infrastructures.postgresql.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_role
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Alias("TRole")
public class TRole extends IBaseEntity implements Serializable {
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    private static final long serialVersionUID = 1L;
}