package org.example.spring.domains.services.bill.mysql.service;

import ai.yue.library.base.view.Result;
import org.example.spring.domains.services.bill.mysql.dto.BillAddResult;
import org.example.spring.domains.services.bill.mysql.vo.BillAddVO;

import java.util.Map;

public interface DBillService {
    Result<BillAddResult> addOrder(BillAddVO billAddVO);
}
