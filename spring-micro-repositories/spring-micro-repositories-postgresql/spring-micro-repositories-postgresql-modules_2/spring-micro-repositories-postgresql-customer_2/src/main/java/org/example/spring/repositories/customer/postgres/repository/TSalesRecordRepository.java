package org.example.spring.repositories.customer.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.postgres.table.po.TSalesRecord;
import org.example.spring.repositories.customer.postgres.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}
