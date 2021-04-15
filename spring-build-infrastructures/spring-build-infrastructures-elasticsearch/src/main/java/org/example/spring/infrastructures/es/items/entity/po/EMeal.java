package org.example.spring.infrastructures.es.items.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class EMeal extends IBaseEntity {
    private String code;
    private String name;
    private String type;
    private BigDecimal price;
    private BigDecimal disPrice;
    private BigDecimal marketPrice;
}