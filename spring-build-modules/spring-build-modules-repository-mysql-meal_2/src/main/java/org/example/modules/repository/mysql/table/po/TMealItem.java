package org.example.modules.repository.mysql.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealItem extends IBaseEntity implements Serializable {
    private Long mealId;
    private String mealCode;
    private String mealName;
    private String itemId;
    private String itemCode;
    private String itemName;
    private String itemDesc;
    private BigDecimal price;
    private BigDecimal disPrice;

}