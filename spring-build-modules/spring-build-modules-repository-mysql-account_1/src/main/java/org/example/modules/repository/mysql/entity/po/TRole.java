package org.example.modules.repository.mysql.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TRole extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    private String name;
}