package org.example.spring.repositories.commons.entity.auth.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

/**
 * t_user_role
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.repositories.mysql.auth-table-po-TUserRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleQuery extends ICommonsQuery {
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