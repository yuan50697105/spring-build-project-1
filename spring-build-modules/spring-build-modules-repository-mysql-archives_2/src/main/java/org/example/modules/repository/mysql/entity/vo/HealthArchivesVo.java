package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class HealthArchivesVo extends IBaseVo {

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
     * customerName
     */
    private String customerName;
    /**
     * 结论
     */
    private String conclusion;
    /**
     * 紧急异常
     */
    private String emergency;

}