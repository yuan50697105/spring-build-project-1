package org.example.spring.models.postgresql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.postgresql.patient.table.po.TPatient;
import org.example.spring.models.commons.enumerate.CustomerType;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends TPatient {
    @Override
    public String getCustomerType() {
        return Optional.ofNullable(CustomerType.get(super.getCustomerType())).map(CustomerType::getValue).orElse(null);
    }
}