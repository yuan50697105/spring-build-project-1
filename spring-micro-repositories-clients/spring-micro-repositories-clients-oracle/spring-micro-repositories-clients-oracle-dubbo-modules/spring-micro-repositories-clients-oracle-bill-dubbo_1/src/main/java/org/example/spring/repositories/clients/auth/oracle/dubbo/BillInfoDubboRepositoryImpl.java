package org.example.spring.repositories.clients.auth.oracle.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillInfoRepository;
import org.example.spring.repositories.clients.dubbo.bill.api.BillInfoDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.bill.dto.BillInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillInfoVo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@DubboService
@Primary
public class BillInfoDubboRepositoryImpl extends CommonsDubboRepositoryImpl<BillInfo, BillInfoVo, BillInfoDTO, BillInfoQuery, BillInfoRepository> implements BillInfoDubboRepository {
    protected BillInfoDubboRepositoryImpl(BillInfoRepository repository) {
        super(repository);
    }
}