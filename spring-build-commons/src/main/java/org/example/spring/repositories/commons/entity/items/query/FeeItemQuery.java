package org.example.spring.repositories.commons.entity.items.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.commons.enumerate.Sex;

import java.math.BigDecimal;

/**
 * 收费项目
 *
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FeeItemQuery extends ICommonsQuery {
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

    public String getType() {
        return FeeItemType.getValue(type);
    }

    public void setType(String type) {
        this.type = FeeItemType.getValue(type);
    }

    public String getSex() {
        return Sex.getValue(sex);
    }

    public void setSex(String sex) {
        this.sex = Sex.getValue(sex);
    }
}