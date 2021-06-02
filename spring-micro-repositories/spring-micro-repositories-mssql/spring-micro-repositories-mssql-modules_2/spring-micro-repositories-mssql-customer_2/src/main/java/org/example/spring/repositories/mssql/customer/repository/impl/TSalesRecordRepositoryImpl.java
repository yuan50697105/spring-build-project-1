package org.example.spring.repositories.mssql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mssql.customer.converter.TSalesRecordConverter;
import org.example.spring.repositories.mssql.customer.dao.TSalesRecordDao;
import org.example.spring.repositories.mssql.customer.repository.TSalesRecordRepository;
import org.example.spring.repositories.mssql.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.mssql.customer.table.po.TSalesRecord;
import org.example.spring.repositories.mssql.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TSalesRecordVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSalesRecordRepositoryImpl extends IBaseRepositoryImpl<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery, TSalesRecordConverter, TSalesRecordDao> implements TSalesRecordRepository {
}