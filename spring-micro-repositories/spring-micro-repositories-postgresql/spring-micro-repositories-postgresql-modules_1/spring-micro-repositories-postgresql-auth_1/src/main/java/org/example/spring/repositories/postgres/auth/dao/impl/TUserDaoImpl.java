package org.example.spring.repositories.postgres.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.postgres.auth.dao.TUserDao;
import org.example.spring.repositories.postgres.auth.mapper.TUserMapper;
import org.example.spring.repositories.postgres.auth.table.po.TUser;
import org.example.spring.repositories.postgres.auth.table.query.TUserQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TUserDaoImpl extends TkBaseDaoImpl<TUser, TUserQuery, TUserMapper> implements TUserDao {
    @Override
    protected Wrapper<TUser> queryWrapper(TUserQuery tUserQuery) {
        return null;
    }

    @Override
    public boolean existByUsername(String username) {
        return baseMapper.existByUsername(username);
    }


    @Override
    public boolean updateStatusByIds(String status, List<Long> ids) {
        return SqlHelper.retBool(baseMapper.updateStatusByIds(status, ids));
    }
}