package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class OrderFormVo implements Serializable {
    private Operating operating;
    private OrderAddVo orderAddVo;

    public enum Operating {
        /**
         * 添加订单
         */
        ADD,
    }



}