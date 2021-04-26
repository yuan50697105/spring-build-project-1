package org.example.spring.infrastructures.clickhouse.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_role_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TRoleResource")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Alias("TRoleResource")
public class TRoleResource extends IBaseEntity implements Serializable {
    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    private Long roleId;

    /**
     * permissionId
     */
    @ApiModelProperty(value = "permissionId")
    private Long resourceId;

    private static final long serialVersionUID = 1L;
}