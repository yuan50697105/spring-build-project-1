package org.example.spring.models.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.po.TPatient;
import org.example.spring.daos.mysql.table.enumerate.TCustomerType;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends TPatient {
    @Override
    public String getCustomerType() {
        return TCustomerType.getName(super.getCustomerType());
    }
}