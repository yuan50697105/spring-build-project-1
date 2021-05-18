package org.example.spring.daos.mysql.bill.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillInfo extends CommonsEntity implements Serializable {

    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 体检号
     */
    private String patientCode;
    /**
     * 体检人ID
     */
    private String patientId;
    /**
     * 体检人姓名
     */
    private String patientName;
    /**
     * 体检人身份证号
     */
    private String patientIdCardNo;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
}