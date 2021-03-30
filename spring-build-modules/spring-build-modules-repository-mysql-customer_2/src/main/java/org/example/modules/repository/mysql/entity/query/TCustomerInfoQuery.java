package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerInfoQuery extends TkBaseQuery<TCustomerInfo> implements MybatisExampleForTk<TCustomerInfo, Example> {
}