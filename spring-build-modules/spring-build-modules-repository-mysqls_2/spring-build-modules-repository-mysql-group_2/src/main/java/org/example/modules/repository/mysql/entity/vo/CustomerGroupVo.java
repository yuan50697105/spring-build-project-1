package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerGroupVo extends IBaseVo {

    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    private String code;
    /**
     * name
     */
    private String name;
}