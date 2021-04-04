package org.example.modules.repository.mysql.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.table.po.TPermission;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPermissionQuery extends TkBaseQuery<TPermission> implements MybatisExampleForTk<TPermission, Example> {
}