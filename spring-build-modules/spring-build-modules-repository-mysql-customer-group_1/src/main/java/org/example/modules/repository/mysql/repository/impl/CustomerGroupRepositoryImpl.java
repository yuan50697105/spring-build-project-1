package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.entity.query.CustomerGroupQuery;
import org.example.modules.repository.mysql.entity.result.CustomerGroup;
import org.example.modules.repository.mysql.entity.vo.CustomerGroupVo;
import org.example.modules.repository.mysql.repository.CustomerGroupRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerGroupRepositoryImpl implements CustomerGroupRepository {
    @Override
    public void save(CustomerGroupVo customerGroupVo) {

    }

    @Override
    public Long saveWithId(CustomerGroupVo customerGroupVo) {
        return null;
    }

    @Override
    public void update(CustomerGroupVo customerGroupVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public CustomerGroup getById(Long id) {
        return null;
    }

    @Override
    public IPageData<CustomerGroup> queryPage(CustomerGroupQuery customerGroupQuery) {
        return null;
    }

    @Override
    public List<CustomerGroup> queryList(CustomerGroupQuery customerGroupQuery) {
        return null;
    }

    @Override
    public CustomerGroup queryOne(CustomerGroupQuery customerGroupQuery) {
        return null;
    }
}