package org.example.spring.repositories.customer.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mysql.converter.TSalesRecordConverter;
import org.example.spring.repositories.customer.mysql.dao.TSalesRecordDao;
import org.example.spring.repositories.customer.mysql.repository.TSalesRecordRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.mysql.table.po.TSalesRecord;
import org.example.spring.repositories.customer.mysql.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TSalesRecordVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSalesRecordRepositoryImpl extends IBaseRepositoryImpl<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery, TSalesRecordConverter, TSalesRecordDao> implements TSalesRecordRepository {
}