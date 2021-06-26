package org.example.spring.domains.services.bill.mysql.service.impl;

import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.bill.mysql.dto.BillAddResult;
import org.example.spring.domains.services.bill.mysql.service.DBillService;
import org.example.spring.domains.services.bill.mysql.vo.BillAddVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DBillServiceImpl implements DBillService {
    @Override
    public Result<BillAddResult> addOrder(BillAddVO billAddVO) {
        return null;
    }
}