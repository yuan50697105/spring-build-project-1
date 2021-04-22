package org.example.spring.models.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.vo.SellerInfoVo;
import org.example.spring.models.commons.entity.IModelVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfoFormVo extends IModelVo {
    private SellerInfoVo seller;

}