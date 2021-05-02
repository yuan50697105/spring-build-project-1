package org.example.spring.daos.es.auth.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_user_role
 */
@ApiModel(value = "org-example-spring-daos-mysql-auth-table-po-TUserRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EUserRoleQuery extends IBaseQuery {
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