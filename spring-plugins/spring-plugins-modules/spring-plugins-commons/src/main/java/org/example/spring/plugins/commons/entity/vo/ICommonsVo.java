package org.example.spring.plugins.commons.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public abstract class ICommonsVo extends ICommonsEntity {


    public interface Update {
    }

    public interface Save {

    }

}