package org.example.spring.infrastructures.postgresql.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@ApiModel(value = "org-example-spring-infrastructures-postgresql-auth-table-po-TRoleResource")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TRoleResource extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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
}