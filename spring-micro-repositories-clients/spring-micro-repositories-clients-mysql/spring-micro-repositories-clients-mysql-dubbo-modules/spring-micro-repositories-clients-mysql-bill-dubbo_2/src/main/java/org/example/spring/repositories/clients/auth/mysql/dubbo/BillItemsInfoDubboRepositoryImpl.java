package org.example.spring.repositories.clients.auth.mysql.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.repositories.clients.bill.api.BillItemsInfoRepository;
import org.example.spring.repositories.clients.dubbo.bill.api.BillItemsInfoDubboRepository;
import org.example.spring.repositories.clients.dubbo.commons.CommonsDubboRepositoryImpl;
import org.example.spring.repositories.commons.entity.bill.dto.BillItemsInfoDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillItemsInfo;
import org.example.spring.repositories.commons.entity.bill.query.BillItemsInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillItemsInfoVo;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class BillItemsInfoDubboRepositoryImpl extends CommonsDubboRepositoryImpl<BillItemsInfo, BillItemsInfoVo, BillItemsInfoDTO, BillItemsInfoQuery, BillItemsInfoRepository> implements BillItemsInfoDubboRepository {
    protected BillItemsInfoDubboRepositoryImpl(BillItemsInfoRepository repository) {
        super(repository);
    }
}