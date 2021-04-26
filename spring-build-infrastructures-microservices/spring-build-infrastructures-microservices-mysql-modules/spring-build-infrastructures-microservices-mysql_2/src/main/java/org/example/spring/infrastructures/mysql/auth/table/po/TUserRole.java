package org.example.spring.infrastructures.mysql.auth.table.po;

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
 * t_user_role
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.infrastructures.mysql.auth-table-po-TUserRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Alias("TUserRole")
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