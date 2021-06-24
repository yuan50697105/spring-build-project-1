package org.example.spring.repositories.customer.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.mysql.table.po.TSalesRecord;
import org.example.spring.repositories.customer.mysql.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}
