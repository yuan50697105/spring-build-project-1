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
import org.example.spring.daos.mssql.auth.table.po.TRoleResource;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;

/**
 * t_role_resource
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TRoleResourceQuery extends TkExtQuery<TRoleResource> implements Serializable, MybatisExampleForTk<TRoleResource, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * roleId
     */
    @AndEqualTo
    private Long roleId;
    @AndIn(property = "roleId")
    private List<Long> roleIds;

    /**
     * permissionId
     */
    @AndEqualTo
    private Long resourceId;
    @AndIn(property = "resourceId")
    private List<Long> resourceIds;

    @Override
    public Wrapper<TRoleResource> wrapper() {
        return Wrappers.emptyWrapper();
    }
}