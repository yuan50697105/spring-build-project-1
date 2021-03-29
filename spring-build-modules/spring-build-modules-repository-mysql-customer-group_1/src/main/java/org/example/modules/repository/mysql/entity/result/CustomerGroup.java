package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerGroup extends IBaseVo {
    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    private static final long serialVersionUID = 1L;
}