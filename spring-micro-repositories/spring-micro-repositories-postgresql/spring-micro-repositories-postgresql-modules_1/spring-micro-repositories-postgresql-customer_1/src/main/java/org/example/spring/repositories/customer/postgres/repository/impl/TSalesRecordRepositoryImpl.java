package org.example.spring.repositories.customer.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.postgres.converter.TSalesRecordConverter;
import org.example.spring.repositories.customer.postgres.dao.TSalesRecordDao;
import org.example.spring.repositories.customer.postgres.repository.TSalesRecordRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.postgres.table.po.TSalesRecord;
import org.example.spring.repositories.customer.postgres.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TSalesRecordVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSalesRecordRepositoryImpl extends IBaseRepositoryImpl<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery, TSalesRecordConverter, TSalesRecordDao> implements TSalesRecordRepository {
}