package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

/**
 * t_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleQuery extends CommonsQuery implements Serializable {
    private static final long serialVersionUID = 3958781961574655476L;
    /**
     * userId
     */
    private Long userId;
    /**
     * roleId
     */
    private Long roleId;

}