package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ITUserQuery extends CommonsQuery implements Serializable {

    private static final long serialVersionUID = -7771931380899991505L;
    /**
     * 用户名
     */
    private String username;
    /**
     * 姓名
     */
    private String name;
    /**
     * 状态
     */
    private String status;
}