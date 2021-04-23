package org.example.spring.infrastructures.postgresql.items.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMeal extends IBaseEntity {
    private String code;
    private String name;
    private String type;
    private BigDecimal price;
    private BigDecimal disPrice;
    private BigDecimal marketPrice;
}