package org.example.spring.infrastructures.es.items.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

import java.math.BigDecimal;

/**
 * 收费项目
 *
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EFeeItemQuery extends IBaseQuery {
    /**
     * 项目编号
     */
    private String code;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 优惠价
     */
    private BigDecimal disPrice;
    /**
     * 市价
     */
    private BigDecimal marketPrice;
    /**
     * 类型
     */
    private String type;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Integer ageStart;
    /**
     * 年龄
     */
    private Integer ageEnd;
}