package org.example.spring.repositories.mysql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.bill.converter.TBillSubInfoConverter;
import org.example.spring.repositories.mysql.bill.dao.TBillSubInfoDao;
import org.example.spring.repositories.mysql.bill.repository.TBillSubInfo2Repository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.mysql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillSubInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfo2RepositoryImpl extends IBaseRepositoryImpl<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery, TBillSubInfoConverter, TBillSubInfoDao> implements TBillSubInfo2Repository {
}