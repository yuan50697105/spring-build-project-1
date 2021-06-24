package org.example.spring.repositories.customer.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.customer.mysql.dao.TSellerInfoDao;
import org.example.spring.repositories.customer.mysql.mapper.TSellerInfoMapper;
import org.example.spring.repositories.customer.mysql.table.po.TSellerInfo;
import org.example.spring.repositories.customer.mysql.table.query.TSellerInfoQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TSellerInfoDaoImpl extends TkBaseDaoImpl<TSellerInfo, TSellerInfoQuery, TSellerInfoMapper> implements TSellerInfoDao {
    @Override
    protected Wrapper<TSellerInfo> queryWrapper(TSellerInfoQuery tSellerInfoQuery) {
        return null;
    }
}