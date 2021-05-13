package org.example.spring.daos.mysql.department.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.department.dao.TCheckDepartmentItemsDao;
import org.example.spring.daos.mysql.department.mapper.TCheckDepartmentItemsMapper;
import org.example.spring.daos.mysql.department.table.po.TCheckDepartmentItems;
import org.example.spring.daos.mysql.department.table.query.TCheckDepartmentItemsQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCheckDepartmentItemsDaoImpl extends TkBaseDaoImpl<TCheckDepartmentItems, TCheckDepartmentItemsQuery, TCheckDepartmentItemsMapper> implements TCheckDepartmentItemsDao {
    @Override
    protected Wrapper<TCheckDepartmentItems> queryWrapper(TCheckDepartmentItemsQuery tCheckDepartmentItemsQuery) {
        return null;
    }
}