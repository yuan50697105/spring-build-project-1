package org.example.spring.daos.mysql.auth.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.po.TUserToken;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

/**
 * 用户Token处理
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TUserTokenQuery extends TkExtQuery<TUserToken> implements MybatisExampleForTk<TUserToken, Example> {
    /**
     * 用户ID
     */
    @AndEqualTo
    private Long userId;
    /**
     * 用户名
     */
    @AndEqualTo
    private String username;
    /**
     * 秘钥状态
     *
     * @see org.example.spring.daos.mysql.table.enumerate.TUserTokenStatus
     */
    private String status;

    @Override
    public Wrapper<TUserToken> wrapper() {
        return Wrappers.emptyWrapper();
    }
}