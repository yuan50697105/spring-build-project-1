package org.example.spring.repositories.mysql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.builder.TBillItemsInfoBuilder;
import org.example.spring.daos.mysql.bill.dao.TBillItemsInfoDao;
import org.example.spring.daos.mysql.bill.repository.TBillItemsInfoRepository;
import org.example.spring.daos.mysql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.utils.CompareUtils;
import org.example.spring.repositories.mysql.bill.builder.TBillItemsInfoBuilder;
import org.example.spring.repositories.mysql.bill.dao.TBillItemsInfoDao;
import org.example.spring.repositories.mysql.bill.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.mysql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillItemsInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TBillItemsInfoRepositoryImpl implements TBillItemsInfoRepository {
    private final TBillItemsInfoBuilder billItemsInfoBuilder;
    private final TBillItemsInfoDao billItemsInfoDao;

    @Override
    public void save(TBillItemsInfoVo vo) {
        billItemsInfoDao.save(billItemsInfoBuilder.build(vo));
    }

    @Override
    public void update(TBillItemsInfoVo vo) {
        TBillItemsInfo billItemsInfo = billItemsInfoBuilder.build(vo);
        Optional<TBillItemsInfo> optional = billItemsInfoDao.getByIdOpt(billItemsInfo.getId());
        if (optional.isPresent()) {
            TBillItemsInfo tBillItemsInfo = optional.get();
            if (!CompareUtils.equals(billItemsInfo, tBillItemsInfo)) {
                billItemsInfoBuilder.copy(billItemsInfo, tBillItemsInfo);
                billItemsInfoDao.updateById(billItemsInfo);
            }
        }
    }

    @Override
    public void delete(Long id) {
        billItemsInfoDao.deleteById(id);
    }

    @Override
    public void delete(Long... ids) {
        billItemsInfoDao.deleteByIds(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        billItemsInfoDao.deleteByIds(ids);
    }

    @Override
    public TBillItemsInfoDTO get(Long id) {
        return billItemsInfoBuilder.build(billItemsInfoDao.getById(id));
    }

    @Override
    public Optional<TBillItemsInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TBillItemsInfoDTO queryOne(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.queryOne(query));
    }

    @Override
    public TBillItemsInfoDTO selectOne(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.selectOne(query));
    }

    @Override
    public Optional<TBillItemsInfoDTO> selectOneOpt(TBillItemsInfoQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public Optional<TBillItemsInfoDTO> queryOneOpt(TBillItemsInfoQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public TBillItemsInfoDTO queryFirst(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.queryFirst(query));
    }

    @Override
    public Optional<TBillItemsInfoDTO> queryFirstOpt(TBillItemsInfoQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TBillItemsInfoDTO selectFirst(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.selectFirst(query));
    }

    @Override
    public Optional<TBillItemsInfoDTO> selectFirstOpt(TBillItemsInfoQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TBillItemsInfoDTO> queryList(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.queryList(query));
    }

    @Override
    public List<TBillItemsInfoDTO> selectList(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.selectList(query));
    }

    @Override
    public Stream<TBillItemsInfoDTO> queryStream(TBillItemsInfoQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<TBillItemsInfoDTO> selectStream(TBillItemsInfoQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TBillItemsInfoDTO> queryTop(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.queryTop(query));
    }

    @Override
    public Stream<TBillItemsInfoDTO> queryTopStream(TBillItemsInfoQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public List<TBillItemsInfoDTO> selectTop(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.selectTop(query));
    }

    @Override
    public Stream<TBillItemsInfoDTO> selectTopStream(TBillItemsInfoQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TBillItemsInfoDTO> selectPage(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.selectPage(query));
    }

    @Override
    public IPageData<TBillItemsInfoDTO> queryPage(TBillItemsInfoQuery query) {
        return billItemsInfoBuilder.build(billItemsInfoDao.queryPage(query));
    }

    @Override
    public List<TBillItemsInfoDTO> queryListBySubId(Long subId) {
        return billItemsInfoBuilder.build(billItemsInfoDao.queryListBySubId(subId));
    }

    @Override
    public List<TBillItemsInfoDTO> queryListByBillId(Long billId) {
        return billItemsInfoBuilder.build(billItemsInfoDao.queryListByBillId(billId));
    }
}