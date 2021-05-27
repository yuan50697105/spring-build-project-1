package org.example.spring.daos.postgresql.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

@ApiModel(value = "org-example-spring-daos-postgresql-auth-table-po-TUser")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUser extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 2799305908245541459L;
    /**
     * username
     */
    @ApiModelProperty(value = "username")
    private String username;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * password
     */
    @ApiModelProperty(value = "password")
    private String password;

    /**
     * status
     */
    @ApiModelProperty(value = "status")
    private String status;
}