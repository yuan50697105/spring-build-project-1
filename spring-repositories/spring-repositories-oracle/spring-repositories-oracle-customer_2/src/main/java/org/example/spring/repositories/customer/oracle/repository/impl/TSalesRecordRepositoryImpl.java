package org.example.spring.repositories.customer.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.oracle.converter.TSalesRecordConverter;
import org.example.spring.repositories.customer.oracle.dao.TSalesRecordDao;
import org.example.spring.repositories.customer.oracle.repository.TSalesRecordRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.oracle.table.po.TSalesRecord;
import org.example.spring.repositories.customer.oracle.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TSalesRecordVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSalesRecordRepositoryImpl extends IBaseRepositoryImpl<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery, TSalesRecordConverter, TSalesRecordDao> implements TSalesRecordRepository {
}