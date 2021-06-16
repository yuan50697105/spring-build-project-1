package org.example.spring.repositories.clients.auth.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillSubInfoRepository;
import org.example.spring.repositories.clients.bill.oracle.api.BillSubInfoRepositoryImpl;
import org.example.spring.repositories.clients.bill.oracle.converter.BillSubInfoRepositoryConverter;
import org.example.spring.repositories.clients.dubbo.bill.api.BillSubInfoDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.bill.dto.BillSubInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillSubInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillSubInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillSubInfoVo;
import org.example.spring.repositories.oracle.bill.repository.TBillSubInfoRepository;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillSubInfoDubboRepositoryImpl extends CommonsDubboRepositoryImpl<BillSubInfo, BillSubInfoVo, BillSubInfoDTO, BillSubInfoQuery, BillSubInfoRepository> implements BillSubInfoDubboRepository {
    protected BillSubInfoDubboRepositoryImpl(BillSubInfoRepository repository) {
        super(repository);
    }
}