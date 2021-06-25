package org.example.spring.repositories.items.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.items.mssql.builder.TCheckItemBuilder;
import org.example.spring.repositories.items.mssql.dao.TCheckItemDao;
import org.example.spring.repositories.items.mssql.repository.TCheckItemRepository;
import org.example.spring.repositories.items.mssql.table.dto.TCheckItemDTO;
import org.example.spring.repositories.items.mssql.table.po.TCheckItem;
import org.example.spring.repositories.items.mssql.table.query.TCheckItemQuery;
import org.example.spring.repositories.items.mssql.table.vo.TCheckItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TCheckItemRepositoryImpl implements TCheckItemRepository {
    private final TCheckItemDao checkItemDao;
    private final TCheckItemBuilder checkItemBuilder;

    @Override
    public void save(TCheckItemVo vo) {
        checkItemDao.save(checkItemBuilder.build(vo));
    }

    @Override
    public void update(TCheckItemVo vo) {
        TCheckItem checkItem = checkItemBuilder.build(vo);
        Optional<TCheckItem> optional = checkItemDao.getByIdOpt(checkItem.getId());
        if (optional.isPresent()) {
            TCheckItem tCheckItem = optional.get();
            checkItemBuilder.copy(checkItem, tCheckItem);
            checkItemDao.update(tCheckItem);
        }
    }

    @Override
    public void delete(Long id) {
        checkItemDao.deleteById(id);
    }

    @Override
    public void delete(Long... ids) {
        checkItemDao.deleteByIds(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        checkItemDao.deleteByIds(ids);
    }

    @Override
    public TCheckItemDTO get(Long id) {
        TCheckItem checkItem = checkItemDao.getById(id);
        return checkItemBuilder.build(checkItem);
    }

    @Override
    public Optional<TCheckItemDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TCheckItemDTO queryOne(TCheckItemQuery query) {
        TCheckItem checkItem = checkItemDao.queryOne(query);
        return checkItemBuilder.build(checkItem);
    }

    @Override
    public TCheckItemDTO selectOne(TCheckItemQuery query) {
        TCheckItem checkItem = checkItemDao.selectOne(query);
        return checkItemBuilder.build(checkItem);
    }

    @Override
    public Optional<TCheckItemDTO> selectOneOpt(TCheckItemQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<TCheckItemDTO> queryOneOpt(TCheckItemQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public TCheckItemDTO queryFirst(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.queryFirst(query));
    }

    @Override
    public Optional<TCheckItemDTO> queryFirstOpt(TCheckItemQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TCheckItemDTO selectFirst(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.selectFirst(query));
    }

    @Override
    public Optional<TCheckItemDTO> selectFirstOpt(TCheckItemQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TCheckItemDTO> queryList(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.queryList(query));
    }

    @Override
    public List<TCheckItemDTO> selectList(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.selectList(query));
    }

    @Override
    public Stream<TCheckItemDTO> queryStream(TCheckItemQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<TCheckItemDTO> selectStream(TCheckItemQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TCheckItemDTO> queryTop(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.queryTop(query));
    }

    @Override
    public List<TCheckItemDTO> selectTop(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.selectTop(query));
    }

    @Override
    public Stream<TCheckItemDTO> queryTopStream(TCheckItemQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public Stream<TCheckItemDTO> selectTopStream(TCheckItemQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TCheckItemDTO> selectPage(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.queryPage(query));
    }

    @Override
    public IPageData<TCheckItemDTO> queryPage(TCheckItemQuery query) {
        return checkItemBuilder.build(checkItemDao.selectPage(query));
    }

    @Override
    public List<TCheckItemDTO> queryListByFeeItemId(Long id) {
        return checkItemBuilder.build(checkItemDao.lambdaQuery().eq(TCheckItem::getFeeItemId, id).list());
    }

}