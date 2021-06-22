package org.example.spring.repositories.commons.entity.department.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.department.po.CheckDepartmentFeeItems;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentFeeItemsDTO extends CheckDepartmentFeeItems {
    @Override
    public String getType() {
        return CheckDepartmentType.getName(super.getType());
    }
}