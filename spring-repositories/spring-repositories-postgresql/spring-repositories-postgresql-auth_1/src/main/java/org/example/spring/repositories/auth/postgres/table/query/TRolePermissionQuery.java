package org.example.spring.repositories.auth.postgres.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.auth.postgres.table.po.TRoleResource;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_role_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.repositories.mysql.auth-table-po-TRolePermission")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TRolePermissionQuery extends TkBaseQuery<TRoleResource> implements Serializable, MybatisExampleForTk<TRoleResource, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    @AndEqualTo
    private Long roleId;
    /**
     * permissionId
     */
    @ApiModelProperty(value = "permissionId")
    @AndEqualTo
    private Long permissionId;
}