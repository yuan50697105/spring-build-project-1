package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.mssql.api.BillInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.mssql.converter.BillInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillInfoDubboRepository;
import org.example.spring.repositories.mssql.bill.repository.TBillInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillInfoRepositoryImpl extends BillInfoRepositoryImpl implements BillInfoDubboRepository {
    public DubboBillInfoRepositoryImpl(TBillInfoRepository repository, BillInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}