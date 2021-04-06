package org.example.modules.repository.mysql.table.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUser extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;
    /**
     * name
     */
    private String name;
    /**
     * enabled
     */
    private Integer enabled;
}