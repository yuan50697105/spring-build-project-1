package org.example.spring.repositories.clients.customer.postgres.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.customer.api.SalesRecordRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SalesRecordDTO;
import org.example.spring.repositories.commons.entity.customer.po.SalesRecord;
import org.example.spring.repositories.commons.entity.customer.query.SalesRecordQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SalesRecordVo;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.example.spring.repositories.feign.customer.clients.SalesRecordRepositoryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class SalesRecordRepositoryController extends CommonsFeignClientImpl<SalesRecord, SalesRecordVo, SalesRecordDTO, SalesRecordQuery, SalesRecordRepository> implements SalesRecordRepositoryClient {
    public SalesRecordRepositoryController(SalesRecordRepository repository) {
        super(repository);
    }
}