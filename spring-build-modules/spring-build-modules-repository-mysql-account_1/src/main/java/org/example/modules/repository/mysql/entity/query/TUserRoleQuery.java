package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TUserRole;
import org.example.plugins.mybatis.entity.query.IBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserRoleQuery extends IBaseQuery implements MybatisExampleForTk<TUserRole, Example> {
}