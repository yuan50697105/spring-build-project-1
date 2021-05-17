package org.example.spring.daos.mysql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.builder.TBillInfoBuilder;
import org.example.spring.daos.mysql.bill.dao.TBillInfoDao;
import org.example.spring.daos.mysql.bill.repository.TBillInfoRepository;
import org.example.spring.daos.mysql.bill.table.dto.TBillInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillInfo;
import org.example.spring.daos.mysql.bill.table.query.TBillInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillInfoVo;
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

    @Override
    public void save(TBillInfoVo vo) {
        billInfoDao.save(billInfoBuilder.build(vo));
    }

    @Override
    public void update(TBillInfoVo vo) {
        TBillInfo TBillInfo = billInfoBuilder.build(vo);
        Optional<TBillInfo> optional = billInfoDao.getByIdOpt(TBillInfo.getId());
        if (optional.isPresent()) {
            TBillInfo TBillInfo1 = optional.get();
            CompareUtils.equals(TBillInfo, TBillInfo1)
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(Long... ids) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public TBillInfoDTO get(Long id) {
        return null;
    }

    @Override
    public Optional<TBillInfoDTO> getOpt(Long id) {
        return Optional.empty();
    }

    @Override
    public TBillInfoDTO queryOne(TBillInfoQuery query) {
        return null;
    }

    @Override
    public TBillInfoDTO selectOne(TBillInfoQuery query) {
        return null;
    }

    @Override
    public Optional<TBillInfoDTO> selectOneOpt(TBillInfoQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<TBillInfoDTO> queryOneOpt(TBillInfoQuery query) {
        return Optional.empty();
    }

    @Override
    public TBillInfoDTO queryFirst(TBillInfoQuery query) {
        return null;
    }

    @Override
    public Optional<TBillInfoDTO> queryFirstOpt(TBillInfoQuery query) {
        return Optional.empty();
    }

    @Override
    public TBillInfoDTO selectFirst(TBillInfoQuery query) {
        return null;
    }

    @Override
    public Optional<TBillInfoDTO> selectFirstOpt(TBillInfoQuery query) {
        return Optional.empty();
    }

    @Override
    public List<TBillInfoDTO> queryList(TBillInfoQuery query) {
        return null;
    }

    @Override
    public List<TBillInfoDTO> selectList(TBillInfoQuery query) {
        return null;
    }

    @Override
    public Stream<TBillInfoDTO> queryStream(TBillInfoQuery query) {
        return null;
    }

    @Override
    public Stream<TBillInfoDTO> selectStream(TBillInfoQuery query) {
        return null;
    }

    @Override
    public List<TBillInfoDTO> queryTop(TBillInfoQuery query) {
        return null;
    }

    @Override
    public Stream<TBillInfoDTO> queryTopStream(TBillInfoQuery query) {
        return null;
    }

    @Override
    public List<TBillInfoDTO> selectTop(TBillInfoQuery query) {
        return null;
    }

    @Override
    public Stream<TBillInfoDTO> selectTopStream(TBillInfoQuery query) {
        return null;
    }

    @Override
    public IPageData<TBillInfoDTO> selectPage(TBillInfoQuery query) {
        return null;
    }

    @Override
    public IPageData<TBillInfoDTO> queryPage(TBillInfoQuery query) {
        return null;
    }
}