package org.example.modules.repository.mysql.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class OrderFormVo implements Serializable {
    /**
     * 操作类型
     */
    @ApiModelProperty
    @NotEmpty
    private Operating operating;
    /**
     * 添加订单VO
     */
    @ApiModelProperty
    private OrderAddVo orderAddVo;

    public enum Operating {
        /**
         * 添加订单
         */
        ADD,
    }



}