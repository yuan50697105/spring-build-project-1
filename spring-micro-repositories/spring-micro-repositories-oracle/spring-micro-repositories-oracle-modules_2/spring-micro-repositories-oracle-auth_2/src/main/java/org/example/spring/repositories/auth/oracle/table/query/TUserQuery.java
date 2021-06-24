package org.example.spring.repositories.auth.oracle.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.auth.oracle.table.po.TUser;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserQuery extends TkBaseQuery<TUser> implements Serializable, MybatisExampleForTk<TUser, Example> {

    /**
     * 用户名
     */
    @AndLike
    private String username;
    /**
     * 姓名
     */
    @AndLike
    private String name;
    /**
     * 状态
     */
    @AndEqualTo
    private String status;

    public void setStatus(String status) {
        this.status = UserStatus.getValue(status);
    }
}