package org.example.spring.models.mysql.customer.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.mysql.customer.entity.query.SalesRecordQuery;
import org.example.spring.models.mysql.customer.entity.result.SalesRecord;
import org.example.spring.models.mysql.customer.entity.result.SalesRecordDetails;
import org.example.spring.models.mysql.customer.entity.vo.SalesRecordVo;

public interface SalesRecordRepository extends IBaseRepository<SalesRecord,SalesRecordVo, SalesRecordDetails, SalesRecordQuery> {
}
