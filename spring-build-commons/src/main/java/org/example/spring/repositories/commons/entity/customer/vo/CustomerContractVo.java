package org.example.spring.repositories.commons.entity.customer.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.CustomerContractStatus;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractVo extends org.example.spring.repositories.commons.entity.customer.po.CustomerContract implements Serializable {
    @Override
    public String getStatus() {
        return CustomerContractStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(CustomerContractStatus.getValue(status));
    }
}