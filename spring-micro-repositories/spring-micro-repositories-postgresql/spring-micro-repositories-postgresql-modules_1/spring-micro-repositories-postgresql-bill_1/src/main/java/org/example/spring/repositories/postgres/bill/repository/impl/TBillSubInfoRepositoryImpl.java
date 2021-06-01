package org.example.spring.repositories.postgres.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.postgres.bill.builder.TBillSubInfoBuilder;
import org.example.spring.repositories.postgres.bill.dao.TBillSubInfoDao;
import org.example.spring.repositories.postgres.bill.repository.TBillItemsInfoRepository;
import org.example.spring.repositories.postgres.bill.repository.TBillSubInfoRepository;
import org.example.spring.repositories.postgres.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.postgres.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.postgres.bill.table.dto.TBillSubInfoDetailsDTO;
import org.example.spring.repositories.postgres.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillSubInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TBillSubInfoRepositoryImpl implements TBillSubInfoRepository {
    private final TBillSubInfoBuilder billSubInfoBuilder;
    private final TBillSubInfoDao billSubInfoDao;
    private final TBillItemsInfoRepository billItemsInfoRepository;

    @Override
    public void save(TBillSubInfoVo vo) {
        billSubInfoDao.save(billSubInfoBuilder.build(vo));
    }

    @Override
    public void update(TBillSubInfoVo vo) {
        billSubInfoDao.updateById(billSubInfoBuilder.build(vo));
    }

    @Override
    public void delete(Long id) {
        throw new RuntimeException("不支持");
    }

    @Override
    public void delete(Long... ids) {
        throw new RuntimeException("不支持");
    }

    @Override
    public void delete(List<Long> ids) {
        throw new RuntimeException("不支持");
    }

    @Override
    public TBillSubInfoDTO get(Long id) {
        return billSubInfoBuilder.build(billSubInfoDao.getById(id));
    }

    @Override
    public Optional<TBillSubInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TBillSubInfoDTO queryOne(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.queryOne(query));
    }

    @Override
    public TBillSubInfoDTO selectOne(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.selectOne(query));
    }

    @Override
    public Optional<TBillSubInfoDTO> selectOneOpt(TBillSubInfoQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public Optional<TBillSubInfoDTO> queryOneOpt(TBillSubInfoQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public TBillSubInfoDTO queryFirst(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.queryFirst(query));
    }

    @Override
    public Optional<TBillSubInfoDTO> queryFirstOpt(TBillSubInfoQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TBillSubInfoDTO selectFirst(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.selectFirst(query));
    }

    @Override
    public Optional<TBillSubInfoDTO> selectFirstOpt(TBillSubInfoQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TBillSubInfoDTO> queryList(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.queryList(query));
    }

    @Override
    public List<TBillSubInfoDTO> selectList(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.selectList(query));
    }

    @Override
    public Stream<TBillSubInfoDTO> queryStream(TBillSubInfoQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<TBillSubInfoDTO> selectStream(TBillSubInfoQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TBillSubInfoDTO> queryTop(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.queryTop(query));
    }

    @Override
    public Stream<TBillSubInfoDTO> queryTopStream(TBillSubInfoQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public List<TBillSubInfoDTO> selectTop(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.selectList(query));
    }

    @Override
    public Stream<TBillSubInfoDTO> selectTopStream(TBillSubInfoQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TBillSubInfoDTO> selectPage(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.selectPage(query));
    }

    @Override
    public IPageData<TBillSubInfoDTO> queryPage(TBillSubInfoQuery query) {
        return billSubInfoBuilder.build(billSubInfoDao.queryPage(query));
    }

    @Override
    public TBillSubInfoDetailsDTO getDetails(Long id) {
        return billSubInfoBuilder.build(get(id), billItemsInfoRepository.queryListBySubId(id));
    }

    @Override
    public List<TBillSubInfoDetailsDTO> queryDetailsListByBillId(Long billId) {
        List<TBillSubInfoDTO> billSubInfoDTOS = billSubInfoBuilder.build(billSubInfoDao.queryDetailsListByBillId(billId));
        List<TBillItemsInfoDTO> billItemsInfoDTOS = billItemsInfoRepository.queryListByBillId(billId);
        return billSubInfoBuilder.build2(billSubInfoDTOS, billItemsInfoDTOS);
    }
}