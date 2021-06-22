package org.example.spring.repositories.commons.entity.department.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

/**
 * 检查科室信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentInfo extends ICommonsEntity {
    /**
     * 科室编号
     */
    private String code;
    /**
     * 科室名称
     */
    private String name;
    /**
     * 科室类型
     *
     * @see CheckDepartmentType
     */
    private String type;
}