package org.example.modules.repository.mysql.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUser extends IBaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}