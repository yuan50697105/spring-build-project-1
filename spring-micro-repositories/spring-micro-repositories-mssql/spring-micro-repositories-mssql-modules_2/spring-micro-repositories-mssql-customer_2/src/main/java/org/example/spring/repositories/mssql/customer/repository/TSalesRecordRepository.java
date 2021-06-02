package org.example.spring.repositories.mssql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.mssql.customer.table.po.TSalesRecord;
import org.example.spring.repositories.mssql.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}
