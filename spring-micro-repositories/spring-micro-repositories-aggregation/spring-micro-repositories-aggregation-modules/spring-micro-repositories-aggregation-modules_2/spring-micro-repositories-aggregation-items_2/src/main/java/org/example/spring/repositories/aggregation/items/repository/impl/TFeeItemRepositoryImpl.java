package org.example.spring.repositories.aggregation.items.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.aggregation.items.builder.TFeeItemBuilder;
import org.example.spring.repositories.aggregation.items.dao.TCheckItemDao;
import org.example.spring.repositories.aggregation.items.dao.TFeeItemDao;
import org.example.spring.repositories.aggregation.items.dao.TMealFeeItemDao;
import org.example.spring.repositories.aggregation.items.repository.TCheckItemRepository;
import org.example.spring.repositories.aggregation.items.repository.TFeeItemRepository;
import org.example.spring.repositories.aggregation.items.table.dto.TCheckItemDTO;
import org.example.spring.repositories.aggregation.items.table.dto.TFeeCheckItemDTO;
import org.example.spring.repositories.aggregation.items.table.dto.TFeeItemDTO;
import org.example.spring.repositories.aggregation.items.table.po.TFeeItem;
import org.example.spring.repositories.aggregation.items.table.query.TFeeItemQuery;
import org.example.spring.repositories.aggregation.items.table.vo.TFeeItemVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TFeeItemRepositoryImpl implements TFeeItemRepository {
    private final TCheckItemRepository checkItemRepository;
    private final TFeeItemBuilder feeItemBuilder;
    private final TFeeItemDao feeItemDao;
    private final TMealFeeItemDao mealFeeItemDao;
    private final TCheckItemDao checkItemDao;


    @Override
    public void save(TFeeItemVo vo) {
        TFeeItem entity = feeItemBuilder.build(vo);
        feeItemDao.save(entity);
    }

    @Override
    public void update(TFeeItemVo vo) {
        TFeeItem feeItem = feeItemBuilder.build(vo);
        Optional<TFeeItem> optional = feeItemDao.getByIdOpt(feeItem.getId());
        if (optional.isPresent()) {
            TFeeItem tFeeItem = optional.get();
            feeItemBuilder.copy(feeItem, tFeeItem);
            feeItemDao.update(tFeeItem);
        }
    }

    @Override
    public void delete(Long id) {
        feeItemDao.deleteById(id);
        mealFeeItemDao.deleteByFeeItemId(id);
        checkItemDao.deleteByFeeItemId(id);
    }

    @Override
    public void delete(Long... ids) {
        feeItemDao.deleteByIds(ids);
        mealFeeItemDao.deleteByFeeItemIds(ids);
        checkItemDao.deleteByFeeItemIds(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        feeItemDao.deleteByIds(ids);
        mealFeeItemDao.deleteByFeeItemIds(ids);
        checkItemDao.deleteByFeeItemIds(ids);
    }

    @Override
    public TFeeItemDTO get(Long id) {
        TFeeItem feeItem = feeItemDao.getById(id);
        return feeItemBuilder.build(feeItem);
    }

    @Override
    public Optional<TFeeItemDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TFeeItemDTO queryOne(TFeeItemQuery query) {
        TFeeItem feeItem = feeItemDao.queryOne(query);
        return feeItemBuilder.build(feeItem);
    }

    @Override
    public TFeeItemDTO selectOne(TFeeItemQuery query) {
        TFeeItem feeItem = feeItemDao.queryOne(query);
        return feeItemBuilder.build(feeItem);
    }

    @Override
    public Optional<TFeeItemDTO> selectOneOpt(TFeeItemQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<TFeeItemDTO> queryOneOpt(TFeeItemQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public TFeeItemDTO queryFirst(TFeeItemQuery query) {
        TFeeItem feeItem = feeItemDao.queryFirst(query);
        return feeItemBuilder.build(feeItem);
    }

    @Override
    public Optional<TFeeItemDTO> queryFirstOpt(TFeeItemQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TFeeItemDTO selectFirst(TFeeItemQuery query) {
        TFeeItem feeItem = feeItemDao.selectFirst(query);
        return feeItemBuilder.build(feeItem);
    }

    @Override
    public Optional<TFeeItemDTO> selectFirstOpt(TFeeItemQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TFeeItemDTO> queryList(TFeeItemQuery query) {
        return feeItemBuilder.build(feeItemDao.queryList(query));
    }

    @Override
    public List<TFeeItemDTO> selectList(TFeeItemQuery query) {
        return feeItemBuilder.build(feeItemDao.selectList(query));
    }

    @Override
    public Stream<TFeeItemDTO> queryStream(TFeeItemQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<TFeeItemDTO> selectStream(TFeeItemQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TFeeItemDTO> queryTop(TFeeItemQuery query) {
        return feeItemBuilder.build(feeItemDao.queryTop(query));
    }

    @Override
    public List<TFeeItemDTO> selectTop(TFeeItemQuery query) {
        return feeItemBuilder.build(feeItemDao.selectTop(query));
    }

    @Override
    public Stream<TFeeItemDTO> queryTopStream(TFeeItemQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public Stream<TFeeItemDTO> selectTopStream(TFeeItemQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TFeeItemDTO> selectPage(TFeeItemQuery query) {
        return feeItemBuilder.build(feeItemDao.queryPage(query));
    }

    @Override
    public IPageData<TFeeItemDTO> queryPage(TFeeItemQuery query) {
        return feeItemBuilder.build(feeItemDao.selectPage(query));
    }

    @Override
    public TFeeCheckItemDTO getDetails(Long id) {
        TFeeItemDTO tFeeItemDTO = get(id);
        List<TCheckItemDTO> tCheckItemDTOS = checkItemRepository.queryListByFeeItemId(id);
        return feeItemBuilder.build2(tFeeItemDTO, tCheckItemDTOS);
    }

    @Override
    public List<TFeeItemDTO> queryListByMealId(Long id) {
        return feeItemBuilder.build(feeItemDao.queryListByMealId(id));
    }
}