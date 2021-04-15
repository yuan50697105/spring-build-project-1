package org.example.spring.models.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.customer.entity.po.TSellerInfo;
import org.example.spring.models.enumerate.SellerInfoStatus;

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