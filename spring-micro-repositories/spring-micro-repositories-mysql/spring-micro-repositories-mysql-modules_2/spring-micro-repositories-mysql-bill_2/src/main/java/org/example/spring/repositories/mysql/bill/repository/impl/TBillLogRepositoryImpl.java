package org.example.spring.repositories.mysql.bill.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.bill.builder.TBillLogBuilder;
import org.example.spring.daos.mysql.bill.dao.TBillLogDao;
import org.example.spring.daos.mysql.bill.repository.TBillLogRepository;
import org.example.spring.daos.mysql.bill.table.dto.TBillLogDTO;
import org.example.spring.daos.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillLogVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.mysql.bill.builder.TBillLogBuilder;
import org.example.spring.repositories.mysql.bill.dao.TBillLogDao;
import org.example.spring.repositories.mysql.bill.repository.TBillLogRepository;
import org.example.spring.repositories.mysql.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.mysql.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.mysql.bill.table.vo.TBillLogVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TBillLogRepositoryImpl implements TBillLogRepository {
    private final TBillLogBuilder billLogBuilder;
    private final TBillLogDao billLogDao;

    @Override
    public void save(TBillLogVo vo) {
        billLogDao.save(billLogBuilder.build(vo));
    }

    @Override
    public void update(TBillLogVo vo) {
        billLogDao.updateSelective(billLogBuilder.build(vo));
    }

    @Override
    public void delete(Long id) {
        billLogDao.deleteById(id);
    }

    @Override
    public void delete(Long... ids) {
        billLogDao.deleteByIds(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        billLogDao.deleteByIds(ids);
    }

    @Override
    public TBillLogDTO get(Long id) {
        return billLogBuilder.build(billLogDao.getById(id));
    }

    @Override
    public Optional<TBillLogDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TBillLogDTO queryOne(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.queryOne(query));
    }

    @Override
    public TBillLogDTO selectOne(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.selectOne(query));
    }

    @Override
    public Optional<TBillLogDTO> selectOneOpt(TBillLogQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public Optional<TBillLogDTO> queryOneOpt(TBillLogQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public TBillLogDTO queryFirst(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.queryFirst(query));
    }

    @Override
    public Optional<TBillLogDTO> queryFirstOpt(TBillLogQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TBillLogDTO selectFirst(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.selectFirst(query));
    }

    @Override
    public Optional<TBillLogDTO> selectFirstOpt(TBillLogQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TBillLogDTO> queryList(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.queryList(query));
    }

    @Override
    public List<TBillLogDTO> selectList(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.selectList(query));
    }

    @Override
    public Stream<TBillLogDTO> queryStream(TBillLogQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<TBillLogDTO> selectStream(TBillLogQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TBillLogDTO> queryTop(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.queryTop(query));
    }

    @Override
    public Stream<TBillLogDTO> queryTopStream(TBillLogQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public List<TBillLogDTO> selectTop(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.selectTop(query));
    }

    @Override
    public Stream<TBillLogDTO> selectTopStream(TBillLogQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TBillLogDTO> selectPage(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.selectPage(query));
    }

    @Override
    public IPageData<TBillLogDTO> queryPage(TBillLogQuery query) {
        return billLogBuilder.build(billLogDao.queryPage(query));
    }
}