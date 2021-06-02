package org.example.spring.repositories.commons.bill.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;
import org.example.spring.repositories.commons.bill.po.BillSubInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfoDTO extends BillSubInfo implements Serializable {

    @Override
    public String getStatus() {
        return BillSubInfoStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(BillSubInfoStatus.getName(status));
    }

}