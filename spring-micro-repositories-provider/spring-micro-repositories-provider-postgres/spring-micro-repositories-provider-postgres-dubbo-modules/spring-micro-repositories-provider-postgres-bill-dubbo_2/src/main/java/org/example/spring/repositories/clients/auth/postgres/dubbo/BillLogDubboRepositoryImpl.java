package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.postgres.api.BillLogRepositoryImpl;
import org.example.spring.repositories.clients.bill.postgres.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillLogDubboRepository;
import org.example.spring.repositories.postgres.bill.repository.TBillLogRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillLogDubboRepositoryImpl extends BillLogRepositoryImpl implements BillLogDubboRepository {
    public BillLogDubboRepositoryImpl(TBillLogRepository repository, BillLogRepositoryConverter converter) {
        super(repository, converter);
    }
}