package org.example.spring.repositories.clients.dubbo.bill.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.entity.bill.po.BillLog;
import org.example.spring.repositories.commons.entity.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillLogVo;

public interface BillLogDubboRepository extends CommonsDubboRepository<BillLog, BillLogVo, BillLogDTO, BillLogQuery> {
}
