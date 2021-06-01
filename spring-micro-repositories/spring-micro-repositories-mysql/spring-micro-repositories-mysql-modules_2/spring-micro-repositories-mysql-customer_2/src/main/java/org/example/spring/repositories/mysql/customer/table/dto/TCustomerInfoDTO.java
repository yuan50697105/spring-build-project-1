package org.example.spring.repositories.mysql.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TCustomerInfoType;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerInfoDTO extends TCustomerInfo implements Serializable {
    @Override
    public String getType() {
        return TCustomerInfoType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TCustomerInfoType.getName(type));
    }
}