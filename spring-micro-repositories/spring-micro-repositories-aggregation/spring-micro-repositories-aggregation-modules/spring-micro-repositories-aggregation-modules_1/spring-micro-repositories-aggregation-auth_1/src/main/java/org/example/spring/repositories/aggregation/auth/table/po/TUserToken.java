package org.example.spring.repositories.aggregation.auth.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.util.Date;

/**
 * 用户Token处理
 */
@SuppressWarnings("ALL")
@EqualsAndHashCode(callSuper = true)
@Data
public class TUserToken extends IBaseEntity {
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