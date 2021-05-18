package org.example.spring.daos.mysql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.ItemSource;
import org.example.spring.daos.mysql.patient.table.po.TPatientCheckItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientCheckItemVo extends TPatientCheckItem {

    @Override
    public void setSource(String source) {
        super.setSource(ItemSource.getValue(source));
    }

    @Override
    public String getSource() {
        return ItemSource.getValue(super.getSource());
    }
}