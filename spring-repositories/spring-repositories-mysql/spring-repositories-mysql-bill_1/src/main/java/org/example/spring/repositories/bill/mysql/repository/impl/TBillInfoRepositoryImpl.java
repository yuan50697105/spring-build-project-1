package org.example.spring.repositories.bill.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.bill.mysql.converter.TBillInfoConverter;
import org.example.spring.repositories.bill.mysql.dao.TBillInfoDao;
import org.example.spring.repositories.bill.mysql.repository.TBillInfoRepository;
import org.example.spring.repositories.bill.mysql.table.dto.TBillInfoDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoRepositoryImpl extends IBaseRepositoryImpl<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery, TBillInfoConverter, TBillInfoDao> implements TBillInfoRepository {
}