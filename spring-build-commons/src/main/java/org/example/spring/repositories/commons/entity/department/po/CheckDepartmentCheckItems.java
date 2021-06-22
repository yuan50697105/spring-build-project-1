package org.example.spring.repositories.commons.entity.department.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentCheckItems extends ICommonsEntity {
    /**
     * 检查科室ID
     */
    private Long checkDepartmentId;
    /**
     * 收费项目ID
     */
    private Long feeItemId;
    /**
     * 检查项目Id
     */
    private Long checkItemId;
    /**
     * 检查项目名称
     */
    private String name;
}
