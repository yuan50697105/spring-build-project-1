package org.example.modules.repository.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.CustomerGroupBuilder;
import org.example.modules.repository.mysql.dao.TCustomerGroupDao;
import org.example.modules.repository.mysql.table.po.TCustomerGroup;
import org.example.modules.repository.mysql.entity.query.CustomerGroupQuery;
import org.example.modules.repository.mysql.entity.query.TCustomerGroupQuery;
import org.example.modules.repository.mysql.entity.result.CustomerGroup;
import org.example.modules.repository.mysql.entity.vo.CustomerGroupVo;
import org.example.modules.repository.mysql.repository.CustomerGroupRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@AllArgsConstructor
public class CustomerGroupRepositoryImpl implements CustomerGroupRepository {
    private final CustomerGroupBuilder customerGroupBuilder;
    private final TCustomerGroupDao customerGroupDao;

    @Override
    public void save(CustomerGroupVo customerGroupVo) {
        saveWithId(customerGroupVo);
    }

    @Override
    public Long saveWithId(CustomerGroupVo customerGroupVo) {
        TCustomerGroup entity = customerGroupBuilder.create(customerGroupVo);
        customerGroupDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(CustomerGroupVo customerGroupVo) {
        Long id = customerGroupVo.getId();
        Optional<TCustomerGroup> optional = customerGroupDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TCustomerGroup customerGroup = optional.get();
            customerGroupBuilder.copy(customerGroupVo, customerGroup);
            customerGroupDao.updateById(customerGroup);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerGroupDao.removeByIds(ids);
    }

    @Override
    public CustomerGroup getById(Long id) {
        TCustomerGroup customerGroup = customerGroupDao.getById(id);
        return customerGroupBuilder.create(customerGroup);
    }

    @Override
    public IPageData<CustomerGroup> queryPage(CustomerGroupQuery customerGroupQuery) {
        TCustomerGroupQuery query = getQuery(customerGroupQuery);
        IPageData<TCustomerGroup> data = customerGroupDao.queryPage(query);
        return customerGroupBuilder.create(data);
    }

    @Override
    public List<CustomerGroup> queryList(CustomerGroupQuery customerGroupQuery) {
        TCustomerGroupQuery query = getQuery(customerGroupQuery);
        List<TCustomerGroup> list = customerGroupDao.queryList(query);
        return customerGroupBuilder.create(list);
    }

    @Override
    public CustomerGroup queryOne(CustomerGroupQuery customerGroupQuery) {
        TCustomerGroupQuery query = getQuery(customerGroupQuery);
        TCustomerGroup customerGroup = customerGroupDao.queryOne(query);
        return customerGroupBuilder.create(customerGroup);
    }

    private TCustomerGroupQuery getQuery(CustomerGroupQuery customerGroupQuery) {
        return customerGroupBuilder.create(customerGroupQuery);
    }
}