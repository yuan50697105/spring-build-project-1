package org.example.spring.daos.mysql.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * t_department
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Department extends CommonsEntity implements Serializable {

    private static final long serialVersionUID = -2963766237752053857L;
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
    private List<Long> roleIds;
}