package org.example.spring.repositories.customer.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mssql.converter.TSalesRecordConverter;
import org.example.spring.repositories.customer.mssql.dao.TSalesRecordDao;
import org.example.spring.repositories.customer.mssql.repository.TSalesRecordRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.mssql.table.po.TSalesRecord;
import org.example.spring.repositories.customer.mssql.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TSalesRecordVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TSalesRecordRepositoryImpl extends IBaseRepositoryImpl<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery, TSalesRecordConverter, TSalesRecordDao> implements TSalesRecordRepository {
}