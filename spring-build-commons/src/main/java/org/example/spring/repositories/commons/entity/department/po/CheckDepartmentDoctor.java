package org.example.spring.repositories.commons.entity.department.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

/**
 * 科室医生
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentDoctor extends ICommonsEntity {
    /**
     * 医生编号
     */
    private String code;
    /**
     * 医生姓名
     */
    private String name;
    /**
     * 擅长领域
     */
    private String areasOfExpertise;
    /**
     * 行医年限
     */
    private Integer yearsOfPractice;
    /**
     * 自我描述
     */
    private String selfDescription;
    /**
     * 隶属科室
     * @see CheckDepartmentType
     */
    private String checkDepartmentType;
}