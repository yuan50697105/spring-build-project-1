package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.postgres.api.BillItemsInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.postgres.converter.BillItemsInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.DubboBillItemsInfoRepository;
import org.example.spring.repositories.postgres.bill.repository.TBillItemsInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillItemsInfoRepositoryImpl extends BillItemsInfoRepositoryImpl implements DubboBillItemsInfoRepository {
    public DubboBillItemsInfoRepositoryImpl(TBillItemsInfoRepository repository, BillItemsInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}