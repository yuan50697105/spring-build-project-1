package org.example.spring.models.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfoDetails extends IBaseVo {
    private SellerInfo seller;

    public abstract void setDefault();
}