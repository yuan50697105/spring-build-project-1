package org.example.spring.infrastructures.mysql.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;

/**
 * t_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ITUserRole extends CommonsEntity implements Serializable {
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