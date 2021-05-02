package org.example.spring.infrastructures.mysql.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;

/**
 * t_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ITResource extends CommonsEntity implements Serializable {
    private static final long serialVersionUID = -483713061676665285L;
    /**
     * name
     */
    private String name;
    /**
     * type
     */
    private String type;
    /**
     * url
     */
    private String url;
    /**
     * pid
     */
    private Long pid;
    /**
     * weight
     */
    private Integer weight;
}