package org.example.modules.repository.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.ArchivesBuilder;
import org.example.modules.repository.mysql.dao.TCustomerHealthArchivesDao;
import org.example.modules.repository.mysql.table.po.TCustomerHealthArchives;
import org.example.modules.repository.mysql.entity.query.CustomerHealthArchivesQuery;
import org.example.modules.repository.mysql.table.query.TCustomerHealthArchivesQuery;
import org.example.modules.repository.mysql.entity.result.CustomerHealthArchives;
import org.example.modules.repository.mysql.entity.vo.HealthArchivesVo;
import org.example.modules.repository.mysql.entity.vo.CustomerHealthArchivesFormVo;
import org.example.modules.repository.mysql.repository.CustomerHealthArchivesRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@AllArgsConstructor
public class CustomerHealthArchivesRepositoryImpl implements CustomerHealthArchivesRepository {
    private final ArchivesBuilder archivesBuilder;
    private final TCustomerHealthArchivesDao customerHealthArchivesDao;

    @Override
    public void save(CustomerHealthArchivesFormVo customerHealthArchivesFormVo) {
        saveWithId(customerHealthArchivesFormVo);
    }

    @Override
    public Long saveWithId(CustomerHealthArchivesFormVo customerHealthArchivesFormVo) {
        HealthArchivesVo archives = customerHealthArchivesFormVo.getArchives();
        TCustomerHealthArchives healthArchives = archivesBuilder.createHealthArchives(archives);
        customerHealthArchivesDao.save(healthArchives);
        return healthArchives.getId();
    }

    @Override
    public void update(CustomerHealthArchivesFormVo customerHealthArchivesFormVo) {
        update(customerHealthArchivesFormVo.getId(), customerHealthArchivesFormVo);

    }

    private void update(Long id, CustomerHealthArchivesFormVo formVo) {
        Optional<TCustomerHealthArchives> optional = customerHealthArchivesDao.getByIdOpt(formVo.getId());
        if (optional.isPresent()) {
            TCustomerHealthArchives healthArchives = optional.get();
            archivesBuilder.copyHealthArchiver(formVo.getArchives(), healthArchives);
            customerHealthArchivesDao.updateById(healthArchives);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerHealthArchivesDao.removeByIds(ids);
    }

    @Override
    public CustomerHealthArchives getById(Long id) {
        TCustomerHealthArchives healthArchives = customerHealthArchivesDao.getById(id);
        return archivesBuilder.createHealthArchives(healthArchives);
    }

    @Override
    public CustomerHealthArchives queryOne(CustomerHealthArchivesQuery customerHealthArchivesQuery) {
        TCustomerHealthArchivesQuery archivesQuery = archivesBuilder.createHealthArchivesQuery(customerHealthArchivesQuery);
        TCustomerHealthArchives healthArchives = customerHealthArchivesDao.queryOne(archivesQuery);
        return archivesBuilder.createHealthArchives(healthArchives);
    }

    @Override
    public List<CustomerHealthArchives> queryList(CustomerHealthArchivesQuery customerHealthArchivesQuery) {
        TCustomerHealthArchivesQuery archivesQuery = archivesBuilder.createHealthArchivesQuery(customerHealthArchivesQuery);
        List<TCustomerHealthArchives> healthArchives = customerHealthArchivesDao.queryList(archivesQuery);
        return archivesBuilder.createHealthArchives(healthArchives);
    }

    @Override
    public IPageData<CustomerHealthArchives> queryPage(CustomerHealthArchivesQuery customerHealthArchivesQuery) {
        TCustomerHealthArchivesQuery archivesQuery = archivesBuilder.createHealthArchivesQuery(customerHealthArchivesQuery);
        IPageData<TCustomerHealthArchives> healthArchives = customerHealthArchivesDao.queryPage(archivesQuery);
        return archivesBuilder.createHealthArchives(healthArchives);
    }
}