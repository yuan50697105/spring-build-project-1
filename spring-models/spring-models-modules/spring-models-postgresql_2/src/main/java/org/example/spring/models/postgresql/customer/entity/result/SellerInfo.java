package org.example.spring.models.postgresql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgresql.customer.table.po.TSellerInfo;
import org.example.spring.models.commons.enumerate.SellerInfoStatus;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfo extends TSellerInfo {
    @Override
    public String getStatus() {
        return Optional.ofNullable(SellerInfoStatus.get(super.getStatus())).map(SellerInfoStatus::getName).orElse(null);
    }
}
