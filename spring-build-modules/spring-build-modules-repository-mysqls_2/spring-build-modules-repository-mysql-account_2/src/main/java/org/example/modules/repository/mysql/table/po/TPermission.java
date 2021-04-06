package org.example.modules.repository.mysql.table.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPermission extends IBaseEntity implements Serializable {
    /**
     * name
     */
    private String name;

    /**
     * type
     */
    private String type;

    private static final long serialVersionUID = 1L;
}