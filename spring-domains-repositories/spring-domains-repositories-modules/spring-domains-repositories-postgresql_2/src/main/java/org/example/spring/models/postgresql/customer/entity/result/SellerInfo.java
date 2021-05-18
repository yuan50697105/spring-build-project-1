package org.example.spring.models.postgresql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TSellerInfoStatus;
import org.example.spring.daos.postgresql.customer.table.po.TSellerInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfo extends TSellerInfo {
    @Override
    public String getStatus() {
        return TSellerInfoStatus.getValue(super.getStatus());
    }
}
