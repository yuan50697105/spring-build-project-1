package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerStaffInfoQuery extends TkBaseQuery<TCustomerStaffInfo> implements MybatisExampleForTk<TCustomerStaffInfo, Example> {
}