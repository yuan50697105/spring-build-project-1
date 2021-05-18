package org.example.spring.models.postgresql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TCustomerType;
import org.example.spring.daos.postgresql.patient.table.po.TPatient;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends TPatient {
    @Override
    public String getCustomerType() {
        return TCustomerType.getName(super.getCustomerType());
    }
}