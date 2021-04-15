package org.example.spring.models.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.enumerate.CustomerType;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends TPatient {
    @Override
    public String getCustomerType() {
        return Optional.ofNullable(CustomerType.get(super.getCustomerType())).map(CustomerType::getValue).orElse(null);
    }
}