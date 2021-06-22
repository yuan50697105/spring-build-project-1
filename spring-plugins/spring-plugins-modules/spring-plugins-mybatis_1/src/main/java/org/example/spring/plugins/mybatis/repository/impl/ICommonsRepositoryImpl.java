package org.example.spring.plugins.mybatis.repository.impl;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.BaseQuery;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.plugins.mybatis.dao.IBaseDao;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;
import org.example.spring.plugins.mybatis.repository.ICommonsRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class ICommonsRepositoryImpl<
        T,
        T2 extends IBaseEntity,
        Q extends BaseQuery,
        Q2 extends IBaseQuery,
        VO extends T,
        DTO extends T,
        C extends ICommonsConverter<T, T2, Q, Q2, VO, DTO>, D extends IBaseDao<T2, Q2>> implements ICommonsRepository<T, DTO, VO, Q> {
    private final C converter;
    private final D dao;

    protected ICommonsRepositoryImpl(C converter, D dao) {
        this.converter = converter;
        this.dao = dao;
    }

    @Override
    public void save(VO vo) {
        dao.save(converter.buildPo(vo));
    }

    @Override
    public void save(VO... vo) {
        dao.saveBatch(converter.buildPo(vo));
    }

    @Override
    public void save(List<VO> vo) {
        dao.saveBatch(converter.buildPo(vo));
    }

    @Override
    public void saveSelective(VO vo) {
        T2 t2 = converter.buildPo(vo);
        dao.saveSelective(t2);
    }

    @Override
    public void saveSelective(VO... vo) {
        dao.saveSelective(converter.buildPo(Arrays.asList(vo)));
    }

    @Override
    public void saveSelective(List<VO> vo) {
        dao.saveSelective(converter.buildPo(vo));
    }

    @Override
    public void saveSetColumns(VO vo) {
        dao.insertSetColumnsBatch(converter.buildPo(Collections.singletonList(vo)));
    }

    @Override
    public void saveSetColumns(VO... vo) {
        dao.insertSetColumnsBatch(converter.buildPo(Arrays.asList(vo)));
    }

    @Override
    public void saveSetColumns(List<VO> vo) {
        dao.insertSetColumnsBatch(converter.buildPo(vo));
    }


    @Override
    public void insert(VO vo) {
        save(vo);
    }

    @Override
    public void insert(VO... vo) {
        save(vo);
    }

    @Override
    public void insert(List<VO> vo) {
        save(vo);
    }

    @Override
    public void insertSelective(VO vo) {
        saveSelective(vo);
    }

    @Override
    public void insertSelective(VO... vo) {
        saveSelective(vo);
    }

    @Override
    public void insertSelective(List<VO> vo) {
        saveSelective(vo);
    }

    @Override
    public void update(VO vo) {
        dao.updateSelective(converter.buildPo(vo));
    }

    @Override
    public void update(VO... vo) {
        dao.updateBatchById(converter.buildPo(Arrays.asList(vo)));
    }

    @Override
    public void update(List<VO> vo) {
        dao.updateBatchById(converter.buildPo(vo));
    }

    @Override
    public void updateNull(VO vo) {
        dao.updateNull(converter.buildPo(vo));
    }

    @Override
    public void updateNull(VO... vo) {
        dao.updateBatchNull(converter.buildPo(Arrays.asList(vo)));
    }

    @Override
    public void updateNull(List<VO> vo) {
        dao.updateBatchNull(converter.buildPo(vo));
    }

    @Override
    public void modify(VO vo) {
        update(vo);
    }

    @Override
    public void modify(VO... vo) {
        update(vo);
    }

    @Override
    public void modify(List<VO> vo) {
        update(vo);
    }

    @Override
    public void modifyNull(VO vo) {
        updateNull(vo);
    }

    @Override
    public void modifyNull(VO... vo) {
        updateNull(vo);
    }

    @Override
    public void modifyNull(List<VO> vo) {
        updateNull(vo);
    }

    @Override
    public void update(VO vo, Q q) {
        dao.updateSelective(converter.buildPo(vo), converter.buildQuery(q));
    }

    @Override
    public void updateNull(VO vo, Q q) {
        dao.update(converter.buildPo(vo), converter.buildQuery(q));
    }

    @Override
    public void modify(VO vo, Q q) {
        update(vo,q);
    }

    @Override
    public void modifyNull(VO vo, Q q) {
        updateNull(vo,q);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public void delete(Long... ids) {
        dao.deleteByIds(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        dao.deleteByIds(ids);
    }

    @Override
    public void remove(Long id) {
        dao.removeById(id);
    }

    @Override
    public void remove(Long... ids) {
        dao.removeByIds(ids);
    }

    @Override
    public void remove(List<Long> ids) {
        dao.removeByIds(ids);
    }

    @Override
    public DTO get(Long id) {
        T2 dao = this.dao.getById(id);
        return converter.buildDTO(dao);
    }

    @Override
    public Optional<DTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<DTO> listByIds(Long... ids) {
        return converter.buildDTOS(dao.listByIds(ids));
    }

    @Override
    public List<DTO> listByIds(List<Long> ids) {
        return converter.buildDTOS(dao.listByIds(ids));
    }

    @Override
    public DTO queryOne(Q q) {
        T2 one = dao.queryOne(converter.buildQuery(q));
        return converter.buildDTO(one);
    }

    @Override
    public Optional<DTO> queryOneOpt(Q q) {
        return Optional.ofNullable(queryOne(q));
    }

    @Override
    public DTO queryFirst(Q q) {
        T2 first = dao.queryFirst(converter.buildQuery(q));
        return converter.buildDTO(first);
    }

    @Override
    public Optional<DTO> queryFirstOpt(Q q) {
        return Optional.ofNullable(queryFirst(q));
    }

    @Override
    public List<DTO> queryList(Q q) {
        List<T2> queryList = dao.queryList(converter.buildQuery(q));
        return converter.buildDTOS(queryList);
    }

    @Override
    public Stream<DTO> queryStream(Q q) {
        return queryList(q).stream();
    }

    @Override
    public List<DTO> queryTop(Q q) {
        List<T2> queryList = dao.queryTop(converter.buildQuery(q));
        return converter.buildDTOS(queryList);
    }

    @Override
    public Stream<DTO> queryTopStream(Q q) {
        return queryTop(q).stream();
    }

    @Override
    public IPageData<DTO> queryPage(Q q) {
        IPageData<T2> queryPage = dao.queryPage(converter.buildQuery(q));
        return converter.buildDTOS(queryPage);
    }

    @Override
    public DTO selectOne(Q q) {
        T2 one = dao.selectOne(converter.buildQuery(q));
        return converter.buildDTO(one);
    }

    @Override
    public Optional<DTO> selectOneOpt(Q q) {
        return Optional.ofNullable(selectOne(q));
    }

    @Override
    public DTO selectFirst(Q q) {
        T2 first = dao.selectFirst(converter.buildQuery(q));
        return converter.buildDTO(first);
    }

    @Override
    public Optional<DTO> selectFirstOpt(Q q) {
        return Optional.ofNullable(selectFirst(q));
    }

    @Override
    public List<DTO> selectList(Q q) {
        List<T2> selectList = dao.selectList(converter.buildQuery(q));
        return converter.buildDTOS(selectList);
    }

    @Override
    public Stream<DTO> selectStream(Q q) {
        return selectList(q).stream();
    }

    @Override
    public List<DTO> selectTop(Q q) {
        List<T2> selectList = dao.selectTop(converter.buildQuery(q));
        return converter.buildDTOS(selectList);
    }

    @Override
    public Stream<DTO> selectTopStream(Q q) {
        return selectTop(q).stream();
    }

    @Override
    public IPageData<DTO> selectPage(Q q) {
        IPageData<T2> selectPage = dao.selectPage(converter.buildQuery(q));
        return converter.buildDTOS(selectPage);
    }

    @Override
    public DTO searchOne(Q q) {
        return queryOne(q);
    }

    @Override
    public Optional<DTO> searchOneOpt(Q q) {
        return queryOneOpt(q);
    }

    @Override
    public DTO searchFirst(Q q) {
        return queryFirst(q);
    }

    @Override
    public Optional<DTO> searchFirstOpt(Q q) {
        return queryFirstOpt(q);
    }

    @Override
    public List<DTO> searchList(Q q) {
        return queryList(q);
    }

    @Override
    public Stream<DTO> searchStream(Q q) {
        return queryStream(q);
    }

    @Override
    public List<DTO> searchTop(Q q) {
        return queryTop(q);
    }

    @Override
    public Stream<DTO> searchTopStream(Q q) {
        return queryTopStream(q);
    }

    @Override
    public IPageData<DTO> searchPage(Q q) {
        return queryPage(q);
    }

    @Override
    public DTO findOne(Q q) {
        return queryOne(q);
    }

    @Override
    public Optional<DTO> findOneOpt(Q q) {
        return queryOneOpt(q);
    }

    @Override
    public DTO findFirst(Q q) {
        return queryFirst(q);
    }

    @Override
    public Optional<DTO> findFirstOpt(Q q) {
        return queryFirstOpt(q);
    }

    @Override
    public List<DTO> findList(Q q) {
        return queryList(q);
    }

    @Override
    public Stream<DTO> findStream(Q q) {
        return queryStream(q);
    }

    @Override
    public List<DTO> findTop(Q q) {
        return queryTop(q);
    }

    @Override
    public Stream<DTO> findTopStream(Q q) {
        return queryTopStream(q);
    }

    @Override
    public IPageData<DTO> findPage(Q q) {
        return queryPage(q);
    }
}