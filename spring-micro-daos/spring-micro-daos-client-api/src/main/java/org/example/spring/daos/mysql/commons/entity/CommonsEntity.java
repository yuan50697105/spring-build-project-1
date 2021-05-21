package org.example.spring.daos.mysql.commons.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsEntity extends ICommonsEntity implements Serializable {

    private static final long serialVersionUID = 303300473375259960L;
    @JsonSerialize(contentUsing = StringSerializer.class)
    private Long id;
}