package org.example.spring.models.mysql.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class SalesRecordVo extends IModelVo implements Serializable {
    private Long sellerId;
    private Long customerId;
    private BigDecimal amount;

}