package org.example.spring.models.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.customer.entity.po.TSellerInfo;
import org.example.spring.models.enumerate.SellerInfoStatus;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfo extends TSellerInfo {
    @Override
    public String getStatus() {
        return Optional.ofNullable(SellerInfoStatus.get(super.getStatus())).map(SellerInfoStatus::getName).orElse(null);
    }
}
