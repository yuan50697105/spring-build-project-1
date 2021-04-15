package org.example.spring.models.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.customer.entity.enumerate.CustomerType;
import org.example.spring.infrastructures.es.patient.entity.po.TPatient;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends TPatient {
    @Override
    public String getCustomerType() {
        return Optional.ofNullable(CustomerType.get(super.getCustomerType())).map(CustomerType::getValue).orElse(null);
    }
}