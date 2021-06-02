package org.example.spring.repositories.commons.auth.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends BaseQuery {

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