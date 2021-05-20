package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.builder.TResourceBuilder;
import org.example.spring.daos.mysql.auth.dao.TResourceDao;
import org.example.spring.daos.mysql.auth.repository.TResourceRepository;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TResourceRepositoryImpl implements TResourceRepository {
    private final TResourceBuilder resourceBuilder;
    private final TResourceDao resourceDao;

    @Override
    public void save(TResourceVo vo) {
        resourceDao.save(resourceBuilder.toPo(vo));
    }

    @Override
    public void update(TResourceVo vo) {
        Optional<TResource> optional = resourceDao.getByIdOpt(vo.getId());
        if (optional.isPresent()) {
            TResource tResource = optional.get();
            resourceBuilder.copy(vo, tResource);
            resourceDao.update(tResource);
        }
    }

    @Override
    public void delete(Long id) {
        resourceDao.deleteById(id);
    }

    @Override
    public void delete(Long... ids) {
        resourceDao.deleteByIds(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        resourceDao.deleteByIds(ids);
    }

    @Override
    public TResourceDTO get(Long id) {
        return resourceBuilder.toDTO(resourceDao.getById(id));
    }

    @Override
    public Optional<TResourceDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TResourceDTO queryOne(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.queryOne(query));
    }

    @Override
    public TResourceDTO selectOne(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.selectOne(query));
    }

    @Override
    public Optional<TResourceDTO> selectOneOpt(TResourceQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<TResourceDTO> queryOneOpt(TResourceQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public TResourceDTO queryFirst(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.queryOne(query));
    }

    @Override
    public Optional<TResourceDTO> queryFirstOpt(TResourceQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TResourceDTO selectFirst(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.selectFirst(query));
    }

    @Override
    public Optional<TResourceDTO> selectFirstOpt(TResourceQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TResourceDTO> queryList(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.queryList(query));
    }

    @Override
    public List<TResourceDTO> selectList(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.selectList(query));
    }

    @Override
    public Stream<TResourceDTO> queryStream(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.queryListStream(query));
    }

    @Override
    public Stream<TResourceDTO> selectStream(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.selectListStream(query));
    }

    @Override
    public List<TResourceDTO> queryTop(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.queryTop(query));
    }

    @Override
    public Stream<TResourceDTO> queryTopStream(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.queryTopStream(query));
    }

    @Override
    public List<TResourceDTO> selectTop(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.selectTop(query));
    }

    @Override
    public Stream<TResourceDTO> selectTopStream(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.selectTopStream(query));
    }

    @Override
    public IPageData<TResourceDTO> selectPage(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.queryPage(query));
    }

    @Override
    public IPageData<TResourceDTO> queryPage(TResourceQuery query) {
        return resourceBuilder.toDTO(resourceDao.selectPage(query));
    }
}