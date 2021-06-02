package org.example.spring.repositories.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.customer.converter.TSalesRecordConverter;
import org.example.spring.repositories.mysql.customer.dao.TSalesRecordDao;
import org.example.spring.repositories.mysql.customer.repository.TSalesRecordRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.mysql.customer.table.po.TSalesRecord;
import org.example.spring.repositories.mysql.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TSalesRecordVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSalesRecordRepositoryImpl extends IBaseRepositoryImpl<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery, TSalesRecordConverter, TSalesRecordDao> implements TSalesRecordRepository {
}