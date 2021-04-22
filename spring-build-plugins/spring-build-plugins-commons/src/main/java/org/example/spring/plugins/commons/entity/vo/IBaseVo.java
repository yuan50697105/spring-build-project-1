package org.example.spring.plugins.commons.entity.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;

import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseVo extends BaseEntity {
    @NotEmpty(groups = {Update.class})
    @JsonSerialize(contentUsing = StringSerializer.class)
    private Long id;

    public IBaseVo withId(Long id) {
        setId(id);
        return this;
    }


    public interface Update {
    }

    public interface Save {

    }

}