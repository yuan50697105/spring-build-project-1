package org.example.spring.repositories.oracle.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.oracle.customer.table.po.TSalesRecord;
import org.example.spring.repositories.oracle.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}