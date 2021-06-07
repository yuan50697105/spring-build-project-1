package org.example.spring.repositories.commons.entity.auth.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;

/**
 * 用户Token处理
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserTokenQuery extends ICommonsQuery {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 秘钥状态
     *
     * @see UserTokenStatus
     */
    private String status;

}