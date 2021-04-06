package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class MealInfoQuery extends BaseQuery {

    /**
     * 套餐编号
     */
    @ApiModelProperty(value = "套餐编号")
    private String code;

    /**
     * 套餐名称
     */
    @ApiModelProperty(value = "套餐名称")
    private String name;

    /**
     * 适用性 性别
     */
    @ApiModelProperty(value = "适用性 性别")
    private String applicabilitySex;

    /**
     * 适用性 婚否
     */
    @ApiModelProperty(value = "适用性 婚否")
    private String applicableMarriage;

    /**
     * 适用性 生育
     */
    @ApiModelProperty(value = "适用性 生育")
    private String applicableFertility;

    /**
     * 适用性 年龄 开始
     */
    @ApiModelProperty(value = "适用性 年龄 开始")
    private Integer applicableAgeStart;

    /**
     * 适用性 年龄 结束
     */
    @ApiModelProperty(value = "适用性 年龄 结束")
    private Integer applicableAgeEnd;
}