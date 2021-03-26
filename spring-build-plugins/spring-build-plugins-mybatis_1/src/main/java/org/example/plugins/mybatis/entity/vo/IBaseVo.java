package org.example.plugins.mybatis.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;

import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
public class IBaseVo extends BaseEntity {
    @NotEmpty(groups = {Update.class})
    private Long id;
    private Long version;

    public void setVersion(Integer version) {
        this.version = Long.valueOf(version);
    }

    public interface Save {
    }

    public interface Update {
    }


}