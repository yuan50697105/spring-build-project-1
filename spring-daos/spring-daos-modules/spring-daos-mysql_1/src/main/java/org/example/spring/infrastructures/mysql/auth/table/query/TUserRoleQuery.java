package org.example.spring.infrastructures.mysql.auth.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.table.po.TUserRole;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_user_role
 */
@ApiModel(value = "org-example-spring-daos-mysql-auth-table-po-TUserRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUserRoleQuery extends TkBaseQuery<TUserRole> implements Serializable, MybatisExampleForTk<TUserRole, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * userId
     */
    @ApiModelProperty(value = "userId")
    @AndEqualTo
    private Long userId;
    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    @AndEqualTo
    private Long roleId;

}