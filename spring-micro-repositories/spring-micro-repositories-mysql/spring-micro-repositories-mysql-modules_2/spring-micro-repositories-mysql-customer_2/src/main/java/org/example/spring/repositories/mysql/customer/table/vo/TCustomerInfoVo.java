package org.example.spring.repositories.mysql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.daos.mysql.table.enumerate.TCustomerInfoType;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerInfoVo extends TCustomerInfo implements Serializable {
    @Override
    public String getType() {
        return TCustomerInfoType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TCustomerInfoType.getValue(type));
    }
}
