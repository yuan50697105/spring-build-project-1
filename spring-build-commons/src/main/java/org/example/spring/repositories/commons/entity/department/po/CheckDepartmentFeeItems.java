package org.example.spring.repositories.commons.entity.department.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.repositories.commons.enumerate.FeeItemType;

/**
 * 科室收费项目
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentFeeItems extends ICommonsEntity {
    /**
     * 检查科室Id
     */
    private Long checkDepartmentId;
    /**
     * 收费项目Id
     */
    private Long feeItemId;
    /**
     * 收费项目名称
     */
    private String feeItemName;
    /**
     * 类型
     * @see FeeItemType
     */
    private String type;
}