package org.example.spring.infrastructures.clickhouse.auth.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.clickhouse.auth.table.po.TRoleResource;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_role_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TRolePermission")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TRolePermissionQuery extends TkBaseQuery<TRoleResource> implements Serializable, MybatisExampleForTk<TRoleResource, Example> {
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

    private static final long serialVersionUID = 1L;
}