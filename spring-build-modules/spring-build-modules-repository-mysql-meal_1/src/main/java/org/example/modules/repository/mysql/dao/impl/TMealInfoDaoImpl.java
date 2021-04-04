package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TMealInfoDao;
import org.example.modules.repository.mysql.table.po.TMealInfo;
import org.example.modules.repository.mysql.table.query.TMealInfoQuery;
import org.example.modules.repository.mysql.mapper.TMealInfoMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@AllArgsConstructor
public class TMealInfoDaoImpl extends TkBaseDaoImpl<TMealInfo, TMealInfoQuery, TMealInfoMapper> implements TMealInfoDao {
    @Override
    protected Wrapper<TMealInfo> queryWrapper(TMealInfoQuery tMealInfoQuery) {
        return null;
    }
}