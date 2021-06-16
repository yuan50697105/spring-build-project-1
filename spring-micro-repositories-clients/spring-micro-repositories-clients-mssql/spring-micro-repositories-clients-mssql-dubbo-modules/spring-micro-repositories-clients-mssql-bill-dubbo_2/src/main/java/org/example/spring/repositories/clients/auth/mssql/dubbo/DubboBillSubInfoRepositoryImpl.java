package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.mssql.api.BillSubInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.mssql.converter.BillSubInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillSubInfoDubboRepository;
import org.example.spring.repositories.mssql.bill.repository.TBillSubInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillSubInfoRepositoryImpl extends BillSubInfoRepositoryImpl implements BillSubInfoDubboRepository {
    public DubboBillSubInfoRepositoryImpl(TBillSubInfoRepository repository, BillSubInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}