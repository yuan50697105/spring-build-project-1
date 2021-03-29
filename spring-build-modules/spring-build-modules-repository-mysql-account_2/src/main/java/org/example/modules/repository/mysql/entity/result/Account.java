package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends IBaseVo {
    private String username;
    private String name;
    private Integer enabled;
}