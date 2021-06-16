package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.mssql.api.BillItemsInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.mssql.converter.BillItemsInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillItemsInfoDubboRepository;
import org.example.spring.repositories.mssql.bill.repository.TBillItemsInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillItemsInfoRepositoryImpl extends BillItemsInfoRepositoryImpl implements BillItemsInfoDubboRepository {
    public DubboBillItemsInfoRepositoryImpl(TBillItemsInfoRepository repository, BillItemsInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}