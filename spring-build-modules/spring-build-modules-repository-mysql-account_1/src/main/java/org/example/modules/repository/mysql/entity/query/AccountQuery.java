package org.example.modules.repository.mysql.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.query.BaseQuery;
import org.example.plugins.mybatis.entity.query.EBaseQuery;
import org.example.plugins.mybatis.entity.query.IBaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountQuery extends BaseQuery {
    private String username;
}