package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoFormVo extends IBaseVo {
    @NotEmpty
    private CustomerInfoVo customer;

    public String getCustomerCode() {
        return Optional.ofNullable(customer).map(CustomerInfoVo::getCode).orElse(null);
    }

}