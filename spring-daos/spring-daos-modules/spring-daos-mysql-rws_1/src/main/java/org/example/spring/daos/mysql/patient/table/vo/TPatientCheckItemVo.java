package org.example.spring.daos.mysql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.daos.mysql.table.enumerate.ItemSource;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientCheckItemVo extends TPatientCheckItem implements Serializable {
    @Override
    public String getSource() {
        return ItemSource.getValue(super.getSource());
    }

    @Override
    public void setSource(String source) {
        super.setSource(ItemSource.getValue(source));
    }
}