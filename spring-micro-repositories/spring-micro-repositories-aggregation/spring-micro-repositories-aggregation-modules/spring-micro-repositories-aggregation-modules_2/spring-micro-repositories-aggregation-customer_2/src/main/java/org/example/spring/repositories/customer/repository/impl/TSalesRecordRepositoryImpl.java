package org.example.spring.repositories.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.converter.TSalesRecordConverter;
import org.example.spring.repositories.customer.dao.TSalesRecordDao;
import org.example.spring.repositories.customer.repository.TSalesRecordRepository;
import org.example.spring.repositories.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.table.po.TSalesRecord;
import org.example.spring.repositories.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.table.vo.TSalesRecordVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSalesRecordRepositoryImpl extends IBaseRepositoryImpl<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery, TSalesRecordConverter, TSalesRecordDao> implements TSalesRecordRepository {
}