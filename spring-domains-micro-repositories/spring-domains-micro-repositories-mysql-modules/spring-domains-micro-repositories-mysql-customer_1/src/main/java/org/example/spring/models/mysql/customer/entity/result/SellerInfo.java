package org.example.spring.models.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TSellerInfo;
import org.example.spring.daos.mysql.table.enumerate.TSellerInfoStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfo extends TSellerInfo {
    @Override
    public String getStatus() {
        return TSellerInfoStatus.getName(super.getStatus());
    }
}
