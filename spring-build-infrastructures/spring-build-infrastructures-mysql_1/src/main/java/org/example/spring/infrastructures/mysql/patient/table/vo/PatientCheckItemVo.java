package org.example.spring.infrastructures.mysql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.enumerate.ItemSource;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientCheckItem;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientCheckItemVo extends TPatientCheckItem {
    @Override
    public void setSource(String source) {
        super.setSource(Optional.ofNullable(ItemSource.get(source)).map(ItemSource::getValue).orElse(null));
    }
}