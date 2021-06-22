package org.example.spring.repositories.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.table.po.TSalesRecord;
import org.example.spring.repositories.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}
