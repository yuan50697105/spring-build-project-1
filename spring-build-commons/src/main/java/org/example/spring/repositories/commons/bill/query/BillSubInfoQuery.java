package org.example.spring.repositories.commons.bill.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfoQuery extends BaseQuery {
    /**
     * 子单单号
     */
    private String subOrderNo;
    /**
     * 总单ID
     */
    private String billId;
    /**
     * 总单单号
     */
    private String orderNo;
    /**
     * 状态
     *
     * @see BillSubInfoStatus
     */
    private String status;


    public String getStatus() {
        return BillSubInfoStatus.getValue(status);
    }

    public void setStatus(String status) {
        this.status = BillSubInfoStatus.getValue(status);
    }
}