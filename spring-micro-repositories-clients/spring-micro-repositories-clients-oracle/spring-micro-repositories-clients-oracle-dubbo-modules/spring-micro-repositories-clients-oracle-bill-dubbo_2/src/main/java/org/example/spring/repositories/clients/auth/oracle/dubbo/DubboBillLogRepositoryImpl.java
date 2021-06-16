package org.example.spring.repositories.clients.auth.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.oracle.api.BillLogRepositoryImpl;
import org.example.spring.repositories.clients.bill.oracle.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillLogDubboRepository;
import org.example.spring.repositories.oracle.bill.repository.TBillLogRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillLogRepositoryImpl extends BillLogRepositoryImpl implements BillLogDubboRepository {
    public DubboBillLogRepositoryImpl(TBillLogRepository repository, BillLogRepositoryConverter converter) {
        super(repository, converter);
    }
}