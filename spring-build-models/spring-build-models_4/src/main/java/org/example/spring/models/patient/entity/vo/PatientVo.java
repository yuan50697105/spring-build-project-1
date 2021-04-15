package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.patient.entity.po.TPatient;
import org.example.spring.models.enumerate.CustomerType;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientVo extends TPatient {
    @Override
    public String getCustomerType() {
        return Optional.ofNullable(CustomerType.get(super.getCustomerType())).map(CustomerType::getValue).orElse(null);
    }

    @Override
    public void setCustomerType(String customerType) {
        super.setCustomerType(Optional.ofNullable(CustomerType.get(customerType)).map(CustomerType::getValue).orElse(null));
    }
}