package org.example.spring.repositories.items.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.items.table.po.TCheckItem;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_check_item
 */
@ApiModel(value = "检查项目")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCheckItemQuery extends TkBaseQuery<TCheckItem> implements Serializable, MybatisExampleForTk<TCheckItem, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    @AndEqualTo
    private Long feeItemId;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
}