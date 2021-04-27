package org.example.spring.infrastructures.postgresql.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

@ApiModel(value = "org-example-spring-infrastructures-postgresql-auth-table-po-TUserRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
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