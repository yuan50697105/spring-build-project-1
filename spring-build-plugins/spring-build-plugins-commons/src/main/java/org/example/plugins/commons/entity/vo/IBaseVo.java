package org.example.plugins.commons.entity.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;

import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
public class IBaseVo extends BaseEntity {
    @NotEmpty(groups = {Update.class})
    @JsonSerialize(using = StringSerializer.class)
    private Long id;
    @JsonSerialize(using = StringSerializer.class)
    private Long version;
    private String requestId;


    public interface Update {
    }

    public interface Save {

    }

}