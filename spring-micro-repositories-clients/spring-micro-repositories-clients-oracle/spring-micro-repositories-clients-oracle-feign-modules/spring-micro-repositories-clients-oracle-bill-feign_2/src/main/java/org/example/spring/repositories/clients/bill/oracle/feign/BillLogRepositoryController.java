package org.example.spring.repositories.clients.bill.oracle.feign;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillLogRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillLog;
import org.example.spring.repositories.commons.entity.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillLogVo;
import org.example.spring.repositories.feign.bill.clients.BillLogRepositoryClient;
import org.example.spring.repositories.feign.commons.clients.impl.CommonsFeignClientImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class BillLogRepositoryController extends CommonsFeignClientImpl<BillLog, BillLogVo, BillLogDTO, BillLogQuery, BillLogRepository> implements BillLogRepositoryClient {
    public BillLogRepositoryController(BillLogRepository repository) {
        super(repository);
    }
}