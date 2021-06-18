package org.example.spring.repositories.clients.customer.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.SalesRecordRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.clients.dubbo.customer.api.SalesRecordDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SalesRecordDTO;
import org.example.spring.repositories.commons.entity.customer.po.SalesRecord;
import org.example.spring.repositories.commons.entity.customer.query.SalesRecordQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SalesRecordVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class SalesRecordDubboRepositoryImpl extends CommonsDubboRepositoryImpl<SalesRecord, SalesRecordVo, SalesRecordDTO, SalesRecordQuery, SalesRecordRepository> implements SalesRecordDubboRepository {
    protected SalesRecordDubboRepositoryImpl(SalesRecordRepository repository) {
        super(repository);
    }
}