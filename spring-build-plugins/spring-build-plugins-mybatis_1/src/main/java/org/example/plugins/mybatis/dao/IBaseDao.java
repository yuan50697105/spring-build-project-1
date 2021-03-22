package org.example.plugins.mybatis.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * @author yuane
 */
public interface IBaseDao<T extends IBaseEntity, Q extends MybatisExample<E>, E> extends IService<T> {
}
