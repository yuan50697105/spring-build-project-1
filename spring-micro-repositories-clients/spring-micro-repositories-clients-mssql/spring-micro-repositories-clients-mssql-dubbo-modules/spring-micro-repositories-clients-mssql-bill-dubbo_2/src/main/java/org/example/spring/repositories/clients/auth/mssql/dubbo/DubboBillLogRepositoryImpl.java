package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.mssql.api.BillLogRepositoryImpl;
import org.example.spring.repositories.clients.bill.mssql.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillLogDubboRepository;
import org.example.spring.repositories.mssql.bill.repository.TBillLogRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillLogRepositoryImpl extends BillLogRepositoryImpl implements BillLogDubboRepository {
    public DubboBillLogRepositoryImpl(TBillLogRepository repository, BillLogRepositoryConverter converter) {
        super(repository, converter);
    }
}