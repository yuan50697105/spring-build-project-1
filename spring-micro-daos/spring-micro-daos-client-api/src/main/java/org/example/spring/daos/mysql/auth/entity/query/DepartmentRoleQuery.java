package org.example.spring.daos.mysql.auth.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

/**
 * t_department_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRoleQuery extends CommonsQuery implements Serializable {
    private static final long serialVersionUID = 1808042355796515638L;
    /**
     * departmentId
     */
    private Long departmentId;

    /**
     * roleId
     */
    private Long roleId;
}