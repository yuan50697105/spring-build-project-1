package org.example.modules.repository.mysql.account.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.account.entity.TRole;
import org.example.plugins.mybatis.entity.query.IBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleQuery extends IBaseQuery implements MybatisExampleForTk<TRole, Example> {
}