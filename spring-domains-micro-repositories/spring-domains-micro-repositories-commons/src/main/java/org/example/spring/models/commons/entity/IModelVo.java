package org.example.spring.models.commons.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IModelVo extends IBaseVo {

    @NotEmpty(groups = {Update.class})
    @JsonSerialize(contentUsing = StringSerializer.class)
    private Long id;

    public IBaseVo withId(Long id) {
        setId(id);
        return this;
    }
}