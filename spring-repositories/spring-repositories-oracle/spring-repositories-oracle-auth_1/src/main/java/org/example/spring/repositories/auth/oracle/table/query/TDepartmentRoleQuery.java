package org.example.spring.repositories.auth.oracle.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.auth.oracle.table.po.TDepartmentRole;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_department_role
 */
@ApiModel(value = "org-example-spring-infrastructures-oracle-org.example.spring.repositories.oracle.auth-table-po-TDepartmentRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TDepartmentRoleQuery extends TkBaseQuery<TDepartmentRole> implements Serializable, MybatisExampleForTk<TDepartmentRole, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * departmentId
     */
    @ApiModelProperty(value = "departmentId")
    private Long departmentId;

    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    private Long roleId;
}