package test;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.query.IBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends IBaseQuery implements MybatisExampleForTk<User, Example> {
}