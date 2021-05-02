package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

/**
 * t_role_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class RolePermissionQuery extends CommonsQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * roleId
     */
    private Long roleId;
    /**
     * permissionId
     */
    private Long permissionId;
}