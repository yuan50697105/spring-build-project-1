package org.example.spring.repositories.clients.customer.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SalesRecordDTO;
import org.example.spring.repositories.commons.entity.customer.po.SalesRecord;
import org.example.spring.repositories.commons.entity.customer.query.SalesRecordQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SalesRecordVo;

public interface SalesRecordRepository extends CommonsRepository<SalesRecord, SalesRecordVo, SalesRecordDTO, SalesRecordQuery> {
}
