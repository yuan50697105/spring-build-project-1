package org.example.spring.infrastructures.mysql.customer.entity.vo;

import cn.hutool.core.util.EnumUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerFormVo extends IBaseVo {
    private Operating operating;
    private CustomerVo customer;
    private CustomerContractVo contract;

    public CustomerFormVo withOperating(String name) {
        setOperating(Operating.get(name));
        return this;
    }

    public enum Operating {
        all("", "0"),
        customer("customer", "1"),
        contract("contract", "2");

        public static Operating get(String name) {
            return EnumUtil.likeValueOf(Operating.class, name);
        }
        private String name;
        private String value;

        Operating(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }

}