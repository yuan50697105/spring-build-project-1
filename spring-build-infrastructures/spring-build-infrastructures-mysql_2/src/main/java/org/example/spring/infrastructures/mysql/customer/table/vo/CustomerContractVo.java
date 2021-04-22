package org.example.spring.infrastructures.mysql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.enumerate.CustomerContractStatus;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerContract;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractVo extends TCustomerContract {
    @Override
    public void setStatus(String status) {
        super.setStatus(Optional.ofNullable(CustomerContractStatus.get(status)).map(CustomerContractStatus::getValue).orElse(null));
    }

    @Override
    @NotEmpty
    public Long getCustomerId() {
        return super.getCustomerId();
    }
}