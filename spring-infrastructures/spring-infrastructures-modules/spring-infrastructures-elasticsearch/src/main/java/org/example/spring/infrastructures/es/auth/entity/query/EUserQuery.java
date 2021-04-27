package org.example.spring.infrastructures.es.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class EUserQuery extends IBaseQuery {

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