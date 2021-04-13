package org.example.spring.plugins.commons.entity.vo;

import cn.hutool.core.convert.Convert;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;

import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
public class IBaseVo extends BaseEntity {
    @NotEmpty(groups = {Update.class})
    @JsonSerialize(using = StringSerializer.class)
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