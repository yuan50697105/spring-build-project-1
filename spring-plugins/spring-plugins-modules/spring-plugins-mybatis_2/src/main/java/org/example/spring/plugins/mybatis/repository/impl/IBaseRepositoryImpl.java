package org.example.spring.plugins.mybatis.repository.impl;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.plugins.mybatis.dao.IBaseDao;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
    public void update(VO vo) {
        dao.updateSelective(converter.buildPo(vo));
    }

    @Override
    public void updateNull(VO vo) {
        dao.update(converter.buildPo(vo));
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


}