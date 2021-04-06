package org.example.spring.plugins.commons.entity.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class IBaseResult extends BaseEntity {
    @JsonSerialize(using = StringSerializer.class)
    private Long id;

}