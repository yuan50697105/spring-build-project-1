package org.example.spring.infrastructures.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.entity.enumerate.ItemSource;
import org.example.spring.infrastructures.mysql.patient.entity.enumerate.FeeItemType;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientFeeItem;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFeeItemVo extends TPatientFeeItem {
    @Override
    public void setSource(String source) {
        super.setSource(Optional.ofNullable(ItemSource.get(source)).map(ItemSource::getValue).orElse(null));
    }

    @Override
    public void setType(String type) {
        super.setType(Optional.ofNullable(FeeItemType.get(type)).map(FeeItemType::getValue).orElse(null));
    }
}