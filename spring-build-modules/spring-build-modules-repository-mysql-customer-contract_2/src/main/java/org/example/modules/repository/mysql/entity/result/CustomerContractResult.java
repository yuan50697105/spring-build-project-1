package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractResult extends IBaseVo {

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

    /**
     * contractPath
     */
    private String contractPath;
}