package org.example.spring.daos.postgres.auth.table.po;

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
 * t_user_role
 */
@ApiModel(value = "org-example-spring-daos-mysql-org.example.spring.daos.mysql.auth-table-po-TUserRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Alias("TUserRole")
public class TUserRole extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * userId
     */
    @ApiModelProperty(value = "userId")
    private Long userId;
    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    private Long roleId;
}