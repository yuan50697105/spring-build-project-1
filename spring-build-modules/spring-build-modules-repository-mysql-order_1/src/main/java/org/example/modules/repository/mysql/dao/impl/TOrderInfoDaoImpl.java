package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TOrderInfoDao;
import org.example.modules.repository.mysql.table.po.TOrderInfo;
import org.example.modules.repository.mysql.table.query.TOrderInfoQuery;
import org.example.modules.repository.mysql.mapper.TOrderInfoMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
@Transactional
public class TOrderInfoDaoImpl extends TkBaseDaoImpl<TOrderInfo, TOrderInfoQuery, TOrderInfoMapper> implements TOrderInfoDao {
    @Override
    protected Wrapper<TOrderInfo> queryWrapper(TOrderInfoQuery tOrderInfoQuery) {
        return null;
    }
}