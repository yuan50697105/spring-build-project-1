package org.example.spring.repositories.commons.auth.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.util.Date;

/**
 * 用户Token处理
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserToken extends ICommonsEntity {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 获取时间
     */
    private Date obtainTime;
    /**
     * 失效时间
     */
    private Date expirationTime;
    /**
     * 秘钥内容
     */
    private String token;
    /**
     * 秘钥状态
     *
     * @see org.example.spring.repositories.mysql.table.enumerate.TUserTokenStatus
     */
    private String status;
}