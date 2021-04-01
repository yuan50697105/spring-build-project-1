package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.entity.po.TOrderInfo;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TOrderInfoQuery extends TkBaseQuery<TOrderInfo> implements Serializable, MybatisExampleForTk<TOrderInfo, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * orderNo
     */
    @AndLike
    private String orderNo;
    /**
     * customerId
     */
    @AndEqualTo
    private String customerId;
    /**
     * customerName
     */
    @AndLike
    private String customerName;
    /**
     * type
     */
    @AndEqualTo
    private Integer type;
}