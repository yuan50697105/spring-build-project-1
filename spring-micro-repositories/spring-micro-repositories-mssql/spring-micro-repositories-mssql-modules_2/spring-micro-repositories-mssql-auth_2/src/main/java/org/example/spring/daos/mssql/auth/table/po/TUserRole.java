package org.example.spring.daos.mssql.auth.table.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TUserRole extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * userId
     */
    private Long userId;

    /**
     * roleId
     */
    private Long roleId;
}