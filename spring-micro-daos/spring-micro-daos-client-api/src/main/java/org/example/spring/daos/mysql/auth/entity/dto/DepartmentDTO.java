package org.example.spring.daos.mysql.auth.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentDTO extends CommonsEntity {

    /**
     * name
     */
    private String name;
    /**
     * code
     */
    private String code;
    /**
     * pid
     */
    private Long pid;
}