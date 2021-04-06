package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleQuery extends BaseQuery {
    @AndLike
    private String name;

}