package org.example.spring.models.mysql.customer.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.models.commons.entity.ICommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerModelVo extends ICommonsEntity {

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String code;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;

    @JsonIgnore
    public TCustomerInfo createCustomerForSave() {
        TCustomerInfo customerInfo = new TCustomerInfo();
        customerInfo.setCode(code);
        customerInfo.setName(name);
        customerInfo.setType(type);
        return customerInfo;
    }

}