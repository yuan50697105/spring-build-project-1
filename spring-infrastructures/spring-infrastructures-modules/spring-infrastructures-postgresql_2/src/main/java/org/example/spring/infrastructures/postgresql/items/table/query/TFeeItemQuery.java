package org.example.spring.infrastructures.postgresql.items.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.postgresql.items.table.po.TFeeItem;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 收费项目
 *
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TFeeItemQuery extends TkBaseQuery<TFeeItem> implements Serializable, MybatisExampleForTk<TFeeItem, Example> {
    /**
     * 项目编号
     */
    @AndLike
    private String code;
    /**
     * 项目名称
     */
    @AndLike
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
    @AndEqualTo
    private String type;
    /**
     * 性别
     */
    @AndEqualTo
    private String sex;
    /**
     * 年龄
     */
    @AndGreaterThanOrEqualTo
    private Integer ageStart;
    /**
     * 年龄
     */
    @AndLessThanOrEqualTo
    private Integer ageEnd;
}