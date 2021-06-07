package org.example.spring.repositories.commons.entity.bill.query;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.commons.enumerate.BillLogType;

/**
 * 总单日志
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BillLogQuery extends ICommonsQuery {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 体检号
     */
    private String patientCode;
    private String patientId;
    /**
     * 类型
     *
     * @see BillLogType
     */
    private String type;


    public String getType() {
        return BillLogType.getValue(type);
    }

    public void setType(String type) {
        this.type = BillLogType.getValue(type);
    }
}