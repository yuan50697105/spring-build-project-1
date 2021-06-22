package org.example.spring.repositories.aggregation.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.aggregation.auth.dao.TUserDao;
import org.example.spring.repositories.aggregation.auth.mapper.TUserMapper;
import org.example.spring.repositories.aggregation.auth.table.po.TUser;
import org.example.spring.repositories.aggregation.auth.table.query.TUserQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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
        List<TUser> list = baseMapper.selectBatchByIdsForUpdate(ids);
        list = list.stream().peek(tUser -> tUser.setStatus(status)).collect(Collectors.toList());
        return SqlHelper.retBool(baseMapper.updateBatchById(list));
    }
}