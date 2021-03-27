package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.modules.repository.mysql.mapper.TUserMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
@Transactional
public class TUserDaoImpl extends TkBaseDaoImpl<TUser, TUserQuery, TUserMapper> implements TUserDao {
    @Override
    public boolean existByUsername(String username) {
        return baseMapper.selectOneCountByUsername(username);
    }

    @Override
    public Optional<TUser> getByUsernameOpt(String username) {
        return Optional.empty();
    }

    @Override
    protected Wrapper<TUser> queryWrapper(TUserQuery tUserQuery) {
        return Wrappers.<TUser>lambdaQuery().likeRight(isNotEmpty(tUserQuery.getUsername()), TUser::getUsername, tUserQuery.getUsername());
    }
}