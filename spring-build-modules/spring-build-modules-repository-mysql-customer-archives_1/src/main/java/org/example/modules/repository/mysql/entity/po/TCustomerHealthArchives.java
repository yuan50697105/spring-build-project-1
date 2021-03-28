package org.example.modules.repository.mysql.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerHealthArchives extends IBaseEntity {
    private Long customerId;
    private String customerCode;
    private String customerName;
    /**
     * 结论
     */
    private String conclusion;
    /**
     * 紧急异常
     */
    private String emergency;
}