package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

/**
 * t_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ITResourceQuery extends CommonsQuery implements Serializable {
    private static final long serialVersionUID = 680462284463979385L;
    /**
     * name
     */
    private String name;

    /**
     * type
     */
    private String type;
    private Long pid;

}