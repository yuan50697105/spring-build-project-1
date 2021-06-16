package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.postgres.api.BillSubInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.postgres.converter.BillSubInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.DubboBillSubInfoRepository;
import org.example.spring.repositories.postgres.bill.repository.TBillSubInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillSubInfoRepositoryImpl extends BillSubInfoRepositoryImpl implements DubboBillSubInfoRepository {
    public DubboBillSubInfoRepositoryImpl(TBillSubInfoRepository repository, BillSubInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}