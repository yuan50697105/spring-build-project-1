package org.example.spring.plugins.commons.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseVo extends BaseEntity {


    public interface Update {
    }

    public interface Save {

    }

}