package org.example.spring.repositories.patient.mysql.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.patient.mysql.table.po.TPatientFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientFeeItemDTO extends TPatientFeeItem implements Serializable {
    @Override
    public String getType() {
        return FeeItemType.getName(super.getType());
    }
}