package org.example.spring.infrastructures.mysql.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.enumerate.CustomerCommonsStatus;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerCommons;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerCommonsVo extends TCustomerCommons {
    @Override
    public void setStatus(String status) {
        super.setStatus(Optional.ofNullable(CustomerCommonsStatus.get(status)).map(CustomerCommonsStatus::getValue).orElse(null));
    }

    @Override
    public String getStatus() {
        return Optional.ofNullable(CustomerCommonsStatus.get(super.getStatus())).map(CustomerCommonsStatus::getValue).orElse(null);
    }
}