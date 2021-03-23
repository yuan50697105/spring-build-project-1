package org.example.plugins.mybatis.dao;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import tk.mybatis.mapper.entity.Example;

public interface TkBaseDao<T, Q extends MybatisExampleForTk<T, Example>> extends IBaseDao<T, Q, Example> {
}
