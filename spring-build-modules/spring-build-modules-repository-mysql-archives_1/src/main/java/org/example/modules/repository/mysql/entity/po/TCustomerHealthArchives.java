package org.example.modules.repository.mysql.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_customer_health_archives
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerHealthArchives extends IBaseEntity implements Serializable {
    /**
     * customerId
     */
    private Long customerId;

    /**
     * customerCode
     */
    private String customerCode;

    /**
     * customerName
     */
    private String customerName;

    /**
     * 结论
     */
    private String conclusion;

    /**
     * 紧急异常
     */
    private String emergency;

    private static final long serialVersionUID = 1L;
}