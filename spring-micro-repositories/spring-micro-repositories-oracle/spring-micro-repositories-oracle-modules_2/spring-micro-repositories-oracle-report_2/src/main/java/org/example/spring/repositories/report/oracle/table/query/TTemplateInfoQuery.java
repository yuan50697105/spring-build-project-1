package org.example.spring.repositories.report.oracle.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.report.oracle.table.po.TTemplateInfo;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TTemplateInfoQuery extends TkBaseQuery<TTemplateInfo> implements MybatisExampleForTk<TTemplateInfo, Example> {
    @AndEqualTo
    private String type;
    @AndLike
    private Long code;
    @AndLike
    private String name;
}