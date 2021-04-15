package org.example.spring.models.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.enumerate.SellerInfoStatus;
import org.example.spring.infrastructures.mysql.customer.table.po.TSellerInfo;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfoVo extends TSellerInfo {
    @Override
    public void setStatus(String status) {
        super.setStatus(Optional.ofNullable(SellerInfoStatus.get(status)).map(SellerInfoStatus::getValue).orElse(null));
    }

    @Override
    public String getStatus() {
        return Optional.ofNullable(SellerInfoStatus.get(super.getStatus())).map(SellerInfoStatus::getValue).orElse(null);
    }
}