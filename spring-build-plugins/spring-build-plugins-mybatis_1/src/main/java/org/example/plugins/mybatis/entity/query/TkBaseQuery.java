package org.example.plugins.mybatis.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import tk.mybatis.mapper.entity.Example;

public abstract class TkBaseQuery<T> extends EBaseQuery<Example> implements MybatisExampleForTk<T, Example> {
}