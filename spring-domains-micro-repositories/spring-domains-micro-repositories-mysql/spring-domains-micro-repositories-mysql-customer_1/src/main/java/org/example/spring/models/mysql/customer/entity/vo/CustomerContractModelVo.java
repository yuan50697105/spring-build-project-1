package org.example.spring.models.mysql.customer.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.table.enumerate.TCustomerContractStatus;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractModelVo extends IModelVo {

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

    @JsonIgnore
    public TCustomerContract createContractForSave() {
        TCustomerContract customerContract = new TCustomerContract();
        customerContract.setCode(code);
        customerContract.setName(name);
        customerContract.setCustomerId(customerId);
        customerContract.setStatus(TCustomerContractStatus.UNSIGNED.getValue());
        return customerContract;
    }


}