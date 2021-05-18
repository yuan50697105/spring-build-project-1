package org.example.spring.models.postgresql.customer.entity.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TCustomerContractStatus;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractQuery extends BaseQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 合同编号
     */
    @ApiModelProperty(value = "合同编号")
    private String code;
    /**
     * 客户名称
     */
    @ApiModelProperty(value = "客户名称")
    private String name;
    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    private Long customerId;
    /**
     * 签约时间
     */
    @ApiModelProperty(value = "签约时间")
    private Date signingTime;
    /**
     * 合同状态
     */
    @ApiModelProperty(value = "合同状态")
    private String status;

    public String getStatus() {
        return TCustomerContractStatus.getValue(status);
    }

    public void setStatus(String status) {
        this.status = TCustomerContractStatus.getValue(status);
    }
}