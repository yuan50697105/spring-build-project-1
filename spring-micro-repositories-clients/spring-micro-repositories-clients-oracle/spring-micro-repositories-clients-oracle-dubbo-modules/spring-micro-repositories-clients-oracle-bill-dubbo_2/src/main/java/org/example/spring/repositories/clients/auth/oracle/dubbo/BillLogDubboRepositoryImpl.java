package org.example.spring.repositories.clients.auth.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillLogRepository;
import org.example.spring.repositories.clients.bill.oracle.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillLogDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillLog;
import org.example.spring.repositories.commons.entity.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillLogVo;
import org.example.spring.repositories.oracle.bill.repository.TBillLogRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillLogDubboRepositoryImpl extends CommonsDubboRepositoryImpl<BillLog, BillLogVo, BillLogDTO, BillLogQuery, BillLogRepository> implements BillLogDubboRepository {
    protected BillLogDubboRepositoryImpl(BillLogRepository repository) {
        super(repository);
    }
}