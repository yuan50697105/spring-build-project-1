package org.example.plugins.mybatis.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class IBaseVo extends BaseEntity {

    public interface Save {
    }

    public interface Update {
    }


}