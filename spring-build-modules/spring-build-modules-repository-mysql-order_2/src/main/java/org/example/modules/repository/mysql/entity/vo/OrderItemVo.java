package org.example.modules.repository.mysql.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TOrderItem;
import org.example.modules.repository.mysql.entity.result.OrderItem;

import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItemVo extends TOrderItem {
    @ApiModelProperty("收费项目ID")
    @NotEmpty
    private Long feeItemId;
}