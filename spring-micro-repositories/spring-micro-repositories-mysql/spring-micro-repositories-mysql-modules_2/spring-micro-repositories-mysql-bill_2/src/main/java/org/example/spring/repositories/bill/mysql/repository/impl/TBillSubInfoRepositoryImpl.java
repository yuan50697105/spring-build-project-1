package org.example.spring.repositories.bill.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mysql.converter.TBillSubInfoConverter;
import org.example.spring.repositories.bill.mysql.dao.TBillSubInfoDao;
import org.example.spring.repositories.bill.mysql.repository.TBillSubInfoRepository;
import org.example.spring.repositories.bill.mysql.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillSubInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfoRepositoryImpl extends IBaseRepositoryImpl<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery, TBillSubInfoConverter, TBillSubInfoDao> implements TBillSubInfoRepository {
}