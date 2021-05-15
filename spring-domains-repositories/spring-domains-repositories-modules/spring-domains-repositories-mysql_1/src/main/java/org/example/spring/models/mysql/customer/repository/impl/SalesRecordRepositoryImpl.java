package org.example.spring.models.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.customer.dao.TSalesRecordDao;
import org.example.spring.daos.mysql.customer.table.po.TSalesRecord;
import org.example.spring.daos.mysql.customer.table.query.TSalesRecordQuery;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.example.spring.models.mysql.customer.builder.CustomerModelBuilder;
import org.example.spring.models.mysql.customer.entity.query.SalesRecordQuery;
import org.example.spring.models.mysql.customer.entity.result.SalesRecord;
import org.example.spring.models.mysql.customer.entity.result.SalesRecordDetails;
import org.example.spring.models.mysql.customer.entity.vo.SalesRecordVo;
import org.example.spring.models.mysql.customer.repository.SalesRecordRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class SalesRecordRepositoryImpl extends IBaseRepositoryImpl<SalesRecord, SalesRecordVo, SalesRecordDetails, SalesRecordQuery> implements SalesRecordRepository {
    private final CustomerModelBuilder customerModelBuilder;
    private final TSalesRecordDao salesRecordDao;

    @Override
    public Long saveWithId(SalesRecordVo salesRecordVo) {
        TSalesRecord entity = customerModelBuilder.buildCustomerSalesRecord(salesRecordVo);
        salesRecordDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(SalesRecordVo salesRecordVo) {
        Optional<TSalesRecord> optional = salesRecordDao.getByIdOpt(salesRecordVo.getId());
        if (optional.isPresent()) {
            TSalesRecord tSalesRecord = optional.get();
            customerModelBuilder.copyCustomerSalesRecord(salesRecordVo, tSalesRecord);
            salesRecordDao.updateById(tSalesRecord);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        salesRecordDao.deleteByIds(ids);
    }

    @Override
    public SalesRecord getById(Long id) {
        return customerModelBuilder.buildCustomerSalesRecord(salesRecordDao.getById(id));
    }

    @Override
    public SalesRecordDetails getDetailsById(Long id) {
        SalesRecordDetails salesRecordDetails = new SalesRecordDetails();
        salesRecordDetails.setRecord(customerModelBuilder.buildCustomerSalesRecord(salesRecordDao.getById(id)));
        return salesRecordDetails;
    }

    @Override
    public IPageData<SalesRecord> queryPage(SalesRecordQuery salesRecordQuery) {
        TSalesRecordQuery query = customerModelBuilder.buildCustomerSalesRecordQuery(salesRecordQuery);
        IPageData<TSalesRecord> data = salesRecordDao.queryPage(query);
        return customerModelBuilder.buildCustomerSalesRecord(data);
    }

    @Override
    public List<SalesRecord> queryList(SalesRecordQuery salesRecordQuery) {
        TSalesRecordQuery query = customerModelBuilder.buildCustomerSalesRecordQuery(salesRecordQuery);
        List<TSalesRecord> data = salesRecordDao.queryTop(query, query.getSize());
        return customerModelBuilder.buildCustomerSalesRecord(data);
    }

    @Override
    public SalesRecord queryOne(SalesRecordQuery salesRecordQuery) {
        TSalesRecordQuery query = customerModelBuilder.buildCustomerSalesRecordQuery(salesRecordQuery);
        TSalesRecord data = salesRecordDao.queryFirstOpt(query).orElse(null);
        return customerModelBuilder.buildCustomerSalesRecord(data);
    }
}