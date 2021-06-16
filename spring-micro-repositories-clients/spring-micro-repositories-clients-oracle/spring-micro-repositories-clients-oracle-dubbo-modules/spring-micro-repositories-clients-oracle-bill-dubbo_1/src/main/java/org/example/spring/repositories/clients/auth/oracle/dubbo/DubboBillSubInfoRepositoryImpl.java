package org.example.spring.repositories.clients.auth.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.oracle.api.BillSubInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.oracle.converter.BillSubInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.DubboBillSubInfoRepository;
import org.example.spring.repositories.oracle.bill.repository.TBillSubInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillSubInfoRepositoryImpl extends BillSubInfoRepositoryImpl implements DubboBillSubInfoRepository {
    public DubboBillSubInfoRepositoryImpl(TBillSubInfoRepository repository, BillSubInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}