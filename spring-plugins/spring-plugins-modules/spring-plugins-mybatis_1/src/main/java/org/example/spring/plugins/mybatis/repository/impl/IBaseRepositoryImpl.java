package org.example.spring.plugins.mybatis.repository.impl;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.plugins.mybatis.dao.IBaseDao;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Transactional
public abstract class IBaseRepositoryImpl<T extends IBaseEntity, DTO extends T, VO extends T, Q extends IBaseQuery, C extends IBaseConverter<T, DTO, VO, Q>, D extends IBaseDao<T, Q>> implements IBaseRepository<T, DTO, VO, Q> {
    @Autowired
    protected C converter;
    @Autowired
    protected D dao;

    @Override
    public void save(VO vo) {
        dao.save(converter.buildPo(vo));
    }

    @Override
    public void save(VO... vo) {
        dao.saveBatch(converter.buildPo(Arrays.asList(vo)));
    }

    @Override
    public void save(List<VO> vo) {
        dao.saveBatch(converter.buildPo(vo));
    }

    @Override
    public void saveSelective(VO vo) {
        dao.saveSelective(converter.buildPo(vo));
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
        dao.updateSelective(converter.buildPo(vo), q);
    }

    @Override
    public void updateNull(VO vo, Q q) {
        dao.update(converter.buildPo(vo), q);
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
        T dao = this.dao.getById(id);
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
        T one = dao.queryOne(q);
        return converter.buildDTO(one);
    }

    @Override
    public Optional<DTO> queryOneOpt(Q q) {
        return Optional.ofNullable(queryOne(q));
    }

    @Override
    public DTO queryFirst(Q q) {
        T first = dao.queryFirst(q);
        return converter.buildDTO(first);
    }

    @Override
    public Optional<DTO> queryFirstOpt(Q q) {
        return Optional.ofNullable(queryFirst(q));
    }

    @Override
    public List<DTO> queryList(Q q) {
        List<T> queryList = dao.queryList(q);
        return converter.buildDTOS(queryList);
    }

    @Override
    public Stream<DTO> queryStream(Q q) {
        return queryList(q).stream();
    }

    @Override
    public List<DTO> queryTop(Q q) {
        List<T> queryList = dao.queryTop(q);
        return converter.buildDTOS(queryList);
    }

    @Override
    public Stream<DTO> queryTopStream(Q q) {
        return queryTop(q).stream();
    }

    @Override
    public IPageData<DTO> queryPage(Q q) {
        IPageData<T> queryPage = dao.queryPage(q);
        return converter.buildDTOS(queryPage);
    }

    @Override
    public DTO selectOne(Q q) {
        T one = dao.selectOne(q);
        return converter.buildDTO(one);
    }

    @Override
    public Optional<DTO> selectOneOpt(Q q) {
        return Optional.ofNullable(selectOne(q));
    }

    @Override
    public DTO selectFirst(Q q) {
        T first = dao.selectFirst(q);
        return converter.buildDTO(first);
    }

    @Override
    public Optional<DTO> selectFirstOpt(Q q) {
        return Optional.ofNullable(selectFirst(q));
    }

    @Override
    public List<DTO> selectList(Q q) {
        List<T> selectList = dao.selectList(q);
        return converter.buildDTOS(selectList);
    }

    @Override
    public Stream<DTO> selectStream(Q q) {
        return selectList(q).stream();
    }

    @Override
    public List<DTO> selectTop(Q q) {
        List<T> selectList = dao.selectTop(q);
        return converter.buildDTOS(selectList);
    }

    @Override
    public Stream<DTO> selectTopStream(Q q) {
        return selectTop(q).stream();
    }

    @Override
    public IPageData<DTO> selectPage(Q q) {
        IPageData<T> selectPage = dao.selectPage(q);
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