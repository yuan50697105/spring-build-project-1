package org.example.spring.repositories.patient.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.ItemSource;
import org.example.spring.repositories.patient.postgres.table.po.TPatientCheckItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientCheckItemDTO extends TPatientCheckItem implements Serializable {
    @Override
    public String getSource() {
        return ItemSource.getName(super.getSource());
    }
}