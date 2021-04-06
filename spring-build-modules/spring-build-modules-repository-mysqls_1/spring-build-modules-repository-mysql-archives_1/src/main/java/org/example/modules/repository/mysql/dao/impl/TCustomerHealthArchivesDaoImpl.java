package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TCustomerHealthArchivesDao;
import org.example.modules.repository.mysql.table.po.TCustomerHealthArchives;
import org.example.modules.repository.mysql.table.query.TCustomerHealthArchivesQuery;
import org.example.modules.repository.mysql.mapper.TCustomerHealthArchivesMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@AllArgsConstructor
public class TCustomerHealthArchivesDaoImpl extends TkBaseDaoImpl<TCustomerHealthArchives, TCustomerHealthArchivesQuery, TCustomerHealthArchivesMapper> implements TCustomerHealthArchivesDao {
    @Override
    protected Wrapper<TCustomerHealthArchives> queryWrapper(TCustomerHealthArchivesQuery tCustomerHealthArchivesQuery) {
        return null;
    }
}