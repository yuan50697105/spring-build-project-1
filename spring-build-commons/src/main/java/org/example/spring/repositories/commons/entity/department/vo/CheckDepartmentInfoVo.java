package org.example.spring.repositories.commons.entity.department.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.department.po.CheckDepartmentInfo;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentInfoVo extends CheckDepartmentInfo {
    @Override
    public void setType(String type) {
        super.setType(CheckDepartmentType.getValue(type));
    }
}