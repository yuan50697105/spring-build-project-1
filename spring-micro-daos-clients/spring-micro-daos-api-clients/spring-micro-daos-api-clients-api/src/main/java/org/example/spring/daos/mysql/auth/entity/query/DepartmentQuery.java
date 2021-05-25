package org.example.spring.daos.mysql.auth.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

/**
 * t_department
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentQuery extends CommonsQuery implements Serializable {
    private static final long serialVersionUID = -8733649194885074690L;
    /**
     * name
     */
    private String name;
}