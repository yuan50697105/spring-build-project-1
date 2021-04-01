package org.example.modules.repository.mysql.entity.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfoDetails extends IBaseVo implements Serializable {
    private OrderInfo order;
}