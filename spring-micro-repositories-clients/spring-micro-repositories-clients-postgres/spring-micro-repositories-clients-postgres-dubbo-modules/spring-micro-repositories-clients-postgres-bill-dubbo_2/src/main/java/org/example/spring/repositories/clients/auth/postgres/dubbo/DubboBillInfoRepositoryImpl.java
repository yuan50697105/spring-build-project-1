package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.postgres.api.BillInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.postgres.converter.BillInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.DubboBillInfoRepository;
import org.example.spring.repositories.postgres.bill.repository.TBillInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class DubboBillInfoRepositoryImpl extends BillInfoRepositoryImpl implements DubboBillInfoRepository {
    public DubboBillInfoRepositoryImpl(TBillInfoRepository repository, BillInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}