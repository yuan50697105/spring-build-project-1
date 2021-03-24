package org.example.plugins.mybatis.dao.impl;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import org.example.plugins.mybatis.dao.TkBaseDao;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import tk.mybatis.mapper.entity.Example;

public class TkBaseDaoImpl<T, Q extends MybatisExampleForTk<T, Example>, M extends IBaseMapper<T>> extends IBaseDaoImpl<T, Q, Example, M> implements TkBaseDao<T, Q> {
}