package org.example.modules.repository.mysql.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TAuthClient extends IBaseEntity {
    private String token;
    private String scope;
}
