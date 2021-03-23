package org.example.modules.repository.mysql.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TRole extends IBaseEntity implements Serializable {
    /**
     * name
     */
    private String name;

    private static final long serialVersionUID = 1L;
}