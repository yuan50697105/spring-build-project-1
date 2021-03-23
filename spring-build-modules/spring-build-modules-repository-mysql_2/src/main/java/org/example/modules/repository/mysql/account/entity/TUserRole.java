package org.example.modules.repository.mysql.account.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUserRole extends IBaseEntity implements Serializable {
    /**
     * userId
     */
    private Long userId;

    /**
     * roleId
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;
}