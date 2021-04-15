package org.example.spring.infrastructures.es.auth.entity.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

/**
 * t_user_role
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TUserRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUserRole extends IBaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}