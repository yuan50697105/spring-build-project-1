package org.example.spring.repositories.clients.auth.postgres.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.postgres.api.BillInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.postgres.converter.BillInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillInfoDubboRepository;
import org.example.spring.repositories.postgres.bill.repository.TBillInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillInfoDubboRepositoryImpl extends BillInfoRepositoryImpl implements BillInfoDubboRepository {
    public BillInfoDubboRepositoryImpl(TBillInfoRepository repository, BillInfoRepositoryConverter converter) {
        super(repository, converter);
    }
}