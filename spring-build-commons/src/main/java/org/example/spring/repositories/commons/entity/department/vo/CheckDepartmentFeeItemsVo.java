package org.example.spring.repositories.commons.entity.department.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.department.po.CheckDepartmentFeeItems;
import org.example.spring.repositories.commons.enumerate.CheckDepartmentType;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckDepartmentFeeItemsVo extends CheckDepartmentFeeItems {
    @Override
    public void setType(String type) {
        super.setType(CheckDepartmentType.getValue(type));
    }
}