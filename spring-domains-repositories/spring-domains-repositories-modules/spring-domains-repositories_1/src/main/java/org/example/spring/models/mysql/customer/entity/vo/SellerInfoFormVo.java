package org.example.spring.models.mysql.customer.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TSellerInfo;
import org.example.spring.daos.mysql.table.enumerate.TSellerInfoStatus;
import org.example.spring.models.commons.entity.IModelVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfoFormVo extends IModelVo {


    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * age
     */
    @ApiModelProperty(value = "age")
    private Integer age;

    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    private String phone;

    /**
     * address
     */
    @ApiModelProperty(value = "address")
    private String address;


    @JsonIgnore
    public TSellerInfo createSellerForSave() {
        TSellerInfo sellerInfoVo = new TSellerInfo();
        sellerInfoVo.setCode(code);
        sellerInfoVo.setName(name);
        sellerInfoVo.setAge(age);
        sellerInfoVo.setPhone(phone);
        sellerInfoVo.setAddress(address);
        sellerInfoVo.setStatus(TSellerInfoStatus.WORK.getValue());
        return sellerInfoVo;
    }
}