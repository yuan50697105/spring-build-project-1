package org.example.spring.repositories.mssql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.repositories.mssql.bill.builder.TBillInfoBuilder;
import org.example.spring.repositories.mssql.bill.dao.TBillInfoDao;
import org.example.spring.repositories.mssql.bill.repository.TBillInfoRepository;
import org.example.spring.repositories.mssql.bill.repository.TBillSubInfoRepository;
import org.example.spring.repositories.mssql.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.mssql.bill.table.dto.TBillInfoDetailsDTO;
import org.example.spring.repositories.mssql.bill.table.po.TBillInfo;
import org.example.spring.repositories.mssql.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.utils.CompareUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TBillInfoRepositoryImpl implements TBillInfoRepository {
    private final TBillInfoBuilder billInfoBuilder;
    private final TBillInfoDao billInfoDao;
    private final TBillSubInfoRepository billSubInfoRepository;


    @Override
    public void save(TBillInfoVo vo) {
        billInfoDao.save(billInfoBuilder.build(vo));
    }

    @Override
    public void update(TBillInfoVo vo) {
        TBillInfo billInfo = billInfoBuilder.build(vo);
        Optional<TBillInfo> optional = billInfoDao.getByIdOpt(billInfo.getId());
        if (optional.isPresent()) {
            TBillInfo tBillInfo = optional.get();
            if (!CompareUtils.equals(billInfo, tBillInfo)) {
                billInfoBuilder.copy(billInfo, tBillInfo);
                billInfoDao.update(tBillInfo);
            }
        }
    }

    @Override
    public void delete(Long id) {
        throw new RuntimeException("不支持删除");
    }

    @Override
    public void delete(Long... ids) {
        throw new RuntimeException("不支持删除");
    }

    @Override
    public void delete(List<Long> ids) {
        throw new RuntimeException("不支持删除");
    }

    @Override
    public TBillInfoDTO get(Long id) {
        return billInfoBuilder.build(billInfoDao.getById(id));
    }

    @Override
    public Optional<TBillInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TBillInfoDTO queryOne(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.queryOne(query));
    }

    @Override
    public TBillInfoDTO selectOne(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.selectOne(query));
    }

    @Override
    public Optional<TBillInfoDTO> selectOneOpt(TBillInfoQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<TBillInfoDTO> queryOneOpt(TBillInfoQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public TBillInfoDTO queryFirst(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.queryFirst(query));
    }

    @Override
    public Optional<TBillInfoDTO> queryFirstOpt(TBillInfoQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TBillInfoDTO selectFirst(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.selectFirst(query));
    }

    @Override
    public Optional<TBillInfoDTO> selectFirstOpt(TBillInfoQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TBillInfoDTO> queryList(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.queryList(query));
    }

    @Override
    public List<TBillInfoDTO> selectList(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.selectList(query));
    }

    @Override
    public Stream<TBillInfoDTO> queryStream(TBillInfoQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<TBillInfoDTO> selectStream(TBillInfoQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TBillInfoDTO> queryTop(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.queryTop(query));
    }

    @Override
    public Stream<TBillInfoDTO> queryTopStream(TBillInfoQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public List<TBillInfoDTO> selectTop(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.selectTop(query));
    }

    @Override
    public Stream<TBillInfoDTO> selectTopStream(TBillInfoQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TBillInfoDTO> selectPage(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.selectPage(query));
    }

    @Override
    public IPageData<TBillInfoDTO> queryPage(TBillInfoQuery query) {
        return billInfoBuilder.build(billInfoDao.queryPage(query));
    }

    @Override
    public TBillInfoDetailsDTO getDetails(Long id) {
        return billInfoBuilder.build(get(id), billSubInfoRepository.queryDetailsListByBillId(id));
    }
}