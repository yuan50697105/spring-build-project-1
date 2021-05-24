package org.example.spring.daos.mssql.auth.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndIn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mssql.auth.table.po.TUserRole;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;

/**
 * t_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUserRoleQuery extends TkExtQuery<TUserRole> implements Serializable, MybatisExampleForTk<TUserRole, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * userId
     */
    @AndEqualTo
    private Long userId;
    @AndIn(property = "userId")
    private List<Long> userIds;

    /**
     * roleId
     */
    @AndEqualTo
    private Long roleId;
    @AndIn(property = "roleId")
    private List<Long> roleIds;

    @Override
    public Wrapper<TUserRole> wrapper() {
        return null;
    }
}