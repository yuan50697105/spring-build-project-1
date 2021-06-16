package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.mysql.api.BillLogRepositoryImpl;
import org.example.spring.repositories.clients.bill.mysql.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillLogDubboRepository;
import org.example.spring.repositories.mysql.bill.repository.TBillLogRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillLogDubboRepositoryImpl extends BillLogRepositoryImpl implements BillLogDubboRepository {
    public BillLogDubboRepositoryImpl(TBillLogRepository repository, BillLogRepositoryConverter converter) {
        super(repository, converter);
    }
}