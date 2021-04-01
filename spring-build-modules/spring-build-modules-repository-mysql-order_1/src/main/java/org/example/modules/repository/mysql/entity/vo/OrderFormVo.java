package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.io.Serializable;

@Data
public class OrderFormVo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * orderNo
     */
    private String orderNo;
    /**
     * customerId
     */
    private String customerId;
    /**
     * customerName
     */
    private String customerName;
    /**
     * type
     */
    private Integer type;
}