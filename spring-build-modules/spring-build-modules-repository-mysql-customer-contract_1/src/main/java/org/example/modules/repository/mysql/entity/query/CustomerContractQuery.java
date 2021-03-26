package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.query.IBaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractQuery extends IBaseQuery {
    private static final long serialVersionUID = 1L;
    /**
     * customerId
     */
    private Long customerId;
    /**
     * customerCode
     */
    private String customerCode;
    /**
     * contractName
     */
    private String contractName;

}