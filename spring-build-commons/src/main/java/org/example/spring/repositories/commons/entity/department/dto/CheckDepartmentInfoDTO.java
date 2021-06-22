package org.example.spring.repositories.commons.entity.department.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.department.po.CheckDepartmentInfo;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentInfoDTO extends CheckDepartmentInfo {
    @Override
    public String getType() {
        return CheckDepartmentType.getName(super.getType());
    }
}