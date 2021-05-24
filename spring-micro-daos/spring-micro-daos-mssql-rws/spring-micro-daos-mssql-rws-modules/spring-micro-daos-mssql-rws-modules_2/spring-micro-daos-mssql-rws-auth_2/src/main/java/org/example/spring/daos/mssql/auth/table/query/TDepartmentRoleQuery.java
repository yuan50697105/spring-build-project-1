package org.example.spring.daos.mssql.auth.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndIn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mssql.auth.table.po.TDepartmentRole;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;

/**
 * t_department_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TDepartmentRoleQuery extends TkExtQuery<TDepartmentRole> implements Serializable, MybatisExampleForTk<TDepartmentRole, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * departmentId
     */
    @AndEqualTo
    private Long departmentId;
    @AndIn(property = "departmentId")
    private List<Long> departmentIds;
    /**
     * roleId
     */
    @AndEqualTo
    private Long roleId;
    @AndIn(property = "roleId")
    private List<Long> roleIds;

    @Override
    public Wrapper<TDepartmentRole> wrapper() {
        return Wrappers.emptyWrapper();
    }
}