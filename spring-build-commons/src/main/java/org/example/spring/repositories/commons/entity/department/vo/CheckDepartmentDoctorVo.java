package org.example.spring.repositories.commons.entity.department.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.department.po.CheckDepartmentDoctor;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentDoctorVo extends CheckDepartmentDoctor {
    @Override
    public void setCheckDepartmentType(String checkDepartmentType) {
        super.setCheckDepartmentType(CheckDepartmentType.getName(checkDepartmentType));
    }
}