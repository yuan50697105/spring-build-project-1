package org.example.spring.repositories.customer.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.oracle.table.po.TSalesRecord;
import org.example.spring.repositories.customer.oracle.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}
