package org.example.spring.repositories.mysql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.mysql.customer.table.po.TSalesRecord;
import org.example.spring.repositories.mysql.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TSalesRecordVo;

public interface TSalesRecordRepository extends IBaseRepository<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
}
