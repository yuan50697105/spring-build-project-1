package org.example.modules.repository.mysql.dao.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.LambdaUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.table.po.TUser;
import org.example.modules.repository.mysql.table.query.TUserQuery;
import org.example.modules.repository.mysql.mapper.TUserMapper;
import org.example.plugins.commons.entity.query.BaseQuery;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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
        return lambdaQuery().eq(TUser::getUsername,username).oneOpt();
    }

    @Override
    public void updateStatus(List<Long> ids, int status) {
        lambdaUpdate().in(IBaseEntity::getId, ids).set(TUser::getEnabled, status).update();
    }

    @Override
    protected Wrapper<TUser> queryWrapper(TUserQuery tUserQuery) {
        return Wrappers.<TUser>query()
                .orderBy(true, tUserQuery.getOrderType().equals(BaseQuery.OrderTypeEnum.ASC), StrUtil.toUnderlineCase(tUserQuery.getOrder()))
                .lambda()
                .likeRight(isNotEmpty(tUserQuery.getUsername()), TUser::getUsername, tUserQuery.getUsername());
//        return null;
    }
}