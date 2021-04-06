package org.example.modules.repository.mysql.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.table.po.TMealInfo;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_meal_info
 */
@ApiModel(value = "org-example-modules-repository-mysql-entity-po-TMealInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TMealInfoQuery extends TkBaseQuery<TMealInfo> implements Serializable, MybatisExampleForTk<TMealInfo, Example> {
    /**
     * 套餐编号
     */
    @ApiModelProperty(value = "套餐编号")
    @AndLike
    private String code;

    /**
     * 套餐名称
     */
    @ApiModelProperty(value = "套餐名称")
    @AndLike
    private String name;

    /**
     * 适用性 性别
     */
    @ApiModelProperty(value = "适用性 性别")
    @AndEqualTo
    private String applicabilitySex;

    /**
     * 适用性 婚否
     */
    @ApiModelProperty(value = "适用性 婚否")
    @AndEqualTo
    private String applicableMarriage;

    /**
     * 适用性 生育
     */
    @ApiModelProperty(value = "适用性 生育")
    @AndEqualTo
    private String applicableFertility;

    /**
     * 适用性 年龄 开始
     */
    @ApiModelProperty(value = "适用性 年龄 开始")
    @AndGreaterThanOrEqualTo
    private Integer applicableAgeStart;

    /**
     * 适用性 年龄 结束
     */
    @ApiModelProperty(value = "适用性 年龄 结束")
    @AndLessThanOrEqualTo
    private Integer applicableAgeEnd;
}