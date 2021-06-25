package org.example.spring.repositories.customer.postgres.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.CustomerInfoType;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerInfoVo extends TCustomerInfo implements Serializable {
    @Override
    public String getType() {
        return CustomerInfoType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(CustomerInfoType.getValue(type));
    }
}
