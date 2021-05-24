package org.example.spring.daos.mssql.auth.table.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_department_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TDepartmentRole extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * departmentId
     */
    private Long departmentId;

    /**
     * roleId
     */
    private Long roleId;
}