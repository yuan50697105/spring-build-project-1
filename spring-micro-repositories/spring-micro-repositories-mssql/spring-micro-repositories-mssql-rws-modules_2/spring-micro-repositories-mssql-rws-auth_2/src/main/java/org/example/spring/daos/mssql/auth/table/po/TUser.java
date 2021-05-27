package org.example.spring.daos.mssql.auth.table.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUser extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ???
     */
    private String username;

    /**
     * ??
     */
    private String name;

    /**
     * ??
     */
    private String password;

    /**
     * ??
     *
     * @see TUserStatus
     */
    private String status;
}