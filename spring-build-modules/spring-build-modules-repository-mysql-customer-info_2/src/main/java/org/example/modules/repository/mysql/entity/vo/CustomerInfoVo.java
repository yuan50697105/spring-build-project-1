package org.example.modules.repository.mysql.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoVo extends IBaseVo {
    @NotEmpty
    private CustomerInfo customer;

    public String getCustomerCode() {
        return Optional.ofNullable(customer).map(CustomerInfo::getCode).orElse(null);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerInfo {
        /**
         * 客户编号
         */
        @NotBlank
        private String code;
        /**
         * 客户类型
         */
        @NotBlank
        private String type;
        /**
         * 客户名称
         */
        @NotBlank
        private String name;
    }
}