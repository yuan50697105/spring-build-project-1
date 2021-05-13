package org.example.spring.daos.mysql.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;

/**
 * t_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserRole extends CommonsEntity implements Serializable {
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