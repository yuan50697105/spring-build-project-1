package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.postgres.api.BillLogRepositoryImpl;
import org.example.spring.repositories.clients.bill.postgres.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.DubboBillLogRepository;
import org.example.spring.repositories.postgres.bill.repository.TBillLogRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillLogRepositoryImpl extends BillLogRepositoryImpl implements DubboBillLogRepository {
    public DubboBillLogRepositoryImpl(TBillLogRepository repository, BillLogRepositoryConverter converter) {
        super(repository, converter);
    }
}