package org.example.modules.repository.mysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUserRole extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * userId
     */
    private Long userId;
    /**
     * roleId
     */
    private Long roleId;
}