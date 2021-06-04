package org.example.spring.repositories.clients.bill.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.bill.po.BillLog;
import org.example.spring.repositories.commons.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.bill.vo.BillLogVo;

public interface BillLogRepository extends CommonsRepository<BillLog, BillLogVo, BillLogDTO, BillLogQuery> {
}
