package org.example.spring.domains.services.bill.mysql.vo;

import lombok.Value;
import org.example.spring.repositories.commons.entity.bill.vo.BillInfoVo;

@Value
public class BillAddVO {
    private BillInfoVo bill;
    private BillAddType type;

    public enum BillAddType {
        MAIN("主单", "1", "BillAddMainHandler"),
        SUB("子单", "2", "BillAddSubHandler"),
        ADD("加项", "3", "BillAddAddHandler"),
        ;
        private String name;
        private String code;
        private String beanName;

        BillAddType(String name, String code, String beanName) {
            this.name = name;
            this.code = code;
            this.beanName = beanName;
        }

    }
}