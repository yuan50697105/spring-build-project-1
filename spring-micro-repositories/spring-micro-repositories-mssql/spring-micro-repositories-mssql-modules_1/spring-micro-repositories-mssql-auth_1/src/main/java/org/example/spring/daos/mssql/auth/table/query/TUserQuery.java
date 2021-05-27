package org.example.spring.daos.mssql.auth.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mssql.auth.table.po.TUser;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUserQuery extends TkExtQuery<TUser> implements Serializable, MybatisExampleForTk<TUser, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * ???
     */
    @AndLike
    private String username;

    /**
     * ??
     */
    @AndLike
    private String name;


    /**
     * ??
     *
     * @see TUserStatus
     */
    @AndEqualTo
    private String status;

    @Override
    public Wrapper<TUser> wrapper() {
        return Wrappers.emptyWrapper();
    }

    public String getStatus() {
        return TUserStatus.getValue(status);
    }

    public void setStatus(String status) {
        this.status = TUserStatus.getValue(status);
    }
}