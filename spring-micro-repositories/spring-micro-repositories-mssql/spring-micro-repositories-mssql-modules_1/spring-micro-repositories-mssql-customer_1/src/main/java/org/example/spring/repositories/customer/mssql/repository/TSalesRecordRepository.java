package org.example.spring.repositories.customer.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.mssql.table.po.TSalesRecord;
import org.example.spring.repositories.customer.mssql.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}
