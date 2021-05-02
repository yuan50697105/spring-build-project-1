package org.example.spring.infrastructures.mysql.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * t_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ITRole extends CommonsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    private String name;
    private List<Long> resourceIds;
}