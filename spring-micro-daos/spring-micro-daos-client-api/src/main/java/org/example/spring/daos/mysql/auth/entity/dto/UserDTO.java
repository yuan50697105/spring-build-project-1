package org.example.spring.daos.mysql.auth.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDTO extends CommonsEntity implements Serializable{
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


}