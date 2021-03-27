package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserQuery extends TkBaseQuery<TUser> implements MybatisExampleForTk<TUser, Example> {
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String username;

}