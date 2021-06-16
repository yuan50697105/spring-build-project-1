package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.mysql.api.BillItemsInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.mysql.converter.BillItemsInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillItemsInfoDubboRepository;
import org.example.spring.repositories.mysql.bill.repository.TBillItemsInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillItemsInfoDubboRepositoryImpl extends BillItemsInfoRepositoryImpl implements BillItemsInfoDubboRepository {
    public BillItemsInfoDubboRepositoryImpl(TBillItemsInfoRepository repository, BillItemsInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}