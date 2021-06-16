package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.mysql.api.BillSubInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.mysql.converter.BillSubInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillSubInfoDubboRepository;
import org.example.spring.repositories.mysql.bill.repository.TBillSubInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillSubInfoDubboRepositoryImpl extends BillSubInfoRepositoryImpl implements BillSubInfoDubboRepository {
    public BillSubInfoDubboRepositoryImpl(TBillSubInfoRepository repository, BillSubInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}