package org.example.spring.infrastructures.mysql.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;

/**
 * t_department_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRole extends CommonsEntity implements Serializable {
    private static final long serialVersionUID = -2560703032458467253L;
    /**
     * departmentId
     */
    private Long departmentId;

    /**
     * roleId
     */
    private Long roleId;
}