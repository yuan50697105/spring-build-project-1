package org.example.spring.repositories.commons.entity.department.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.department.po.CheckDepartmentDoctor;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentDoctorDTO extends CheckDepartmentDoctor {
    @Override
    public String getCheckDepartmentType() {
        return CheckDepartmentType.getName(super.getCheckDepartmentType());
    }
}