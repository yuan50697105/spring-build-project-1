package org.example.spring.repositories.mysql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.bill.converter.TBillInfoConverter;
import org.example.spring.repositories.mysql.bill.dao.TBillInfoDao;
import org.example.spring.repositories.mysql.bill.repository.TBillInfo2Repository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillInfo;
import org.example.spring.repositories.mysql.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfo2RepositoryImpl extends IBaseRepositoryImpl<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery, TBillInfoConverter, TBillInfoDao> implements TBillInfo2Repository {
}