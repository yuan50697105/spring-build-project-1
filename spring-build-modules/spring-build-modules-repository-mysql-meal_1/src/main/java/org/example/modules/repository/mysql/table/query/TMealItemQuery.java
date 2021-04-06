package org.example.modules.repository.mysql.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.table.po.TMealItem;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealItemQuery extends TkBaseQuery<TMealItem> implements Serializable, MybatisExampleForTk<TMealItem, Example> {
    @AndEqualTo
    private Long mealId;
    @AndLike
    private String mealCode;
    @AndLike
    private String mealName;
    @AndEqualTo
    private String itemId;
    @AndLike
    private String itemCode;
    @AndLike
    private String itemName;

}