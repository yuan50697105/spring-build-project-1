package org.example.spring.infrastructures.mysql.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * t_user
 *
 * @author yuane
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class User extends CommonsEntity implements Serializable {

    private static final long serialVersionUID = 2799305908245541459L;
    /**
     * 用户名
     */
    private String username;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态
     */
    private String status;

    private List<Long> roleIds;
}