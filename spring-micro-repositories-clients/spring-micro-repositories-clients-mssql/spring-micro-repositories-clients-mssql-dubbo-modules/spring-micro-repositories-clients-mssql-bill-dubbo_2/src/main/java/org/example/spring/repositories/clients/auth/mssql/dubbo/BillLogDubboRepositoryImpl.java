package org.example.spring.repositories.clients.auth.mssql.dubbo;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillLogRepository;
import org.example.spring.repositories.clients.bill.mssql.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillLogDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillLog;
import org.example.spring.repositories.commons.entity.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillLogVo;
import org.example.spring.repositories.mssql.bill.repository.TBillLogRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillLogDubboRepositoryImpl extends CommonsDubboRepositoryImpl<BillLog, BillLogVo, BillLogDTO, BillLogQuery, BillLogRepository> implements BillLogDubboRepository {
    protected BillLogDubboRepositoryImpl(BillLogRepository repository) {
        super(repository);
    }
}