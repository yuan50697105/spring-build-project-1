package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

/**
 * t_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ITRoleQuery extends CommonsQuery implements Serializable {
    private static final long serialVersionUID = -7342253517457573134L;
    /**
     * name
     */
    private String name;

}