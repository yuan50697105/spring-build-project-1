package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TOrderItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItem extends TOrderItem {
}