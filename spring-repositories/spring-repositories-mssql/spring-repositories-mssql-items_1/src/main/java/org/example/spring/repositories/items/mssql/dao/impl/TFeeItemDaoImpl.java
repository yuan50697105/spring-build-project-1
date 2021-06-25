package org.example.spring.repositories.items.mssql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.items.mssql.dao.TFeeItemDao;
import org.example.spring.repositories.items.mssql.mapper.TFeeItemMapper;
import org.example.spring.repositories.items.mssql.mapper.TFeeItemQueryMapper;
import org.example.spring.repositories.items.mssql.table.po.TFeeItem;
import org.example.spring.repositories.items.mssql.table.query.TFeeItemQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TFeeItemDaoImpl extends TkBaseDaoImpl<TFeeItem, TFeeItemQuery, TFeeItemMapper> implements TFeeItemDao {
    private final TFeeItemQueryMapper feeItemQueryMapper;

    @Override
    protected Wrapper<TFeeItem> queryWrapper(TFeeItemQuery tFeeItemQuery) {
        return null;
    }

    @Override
    public List<TFeeItem> queryListByMealId(Long id) {
        return null;
    }
}