package org.example.spring.daos.mysql.items.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.items.builder.TMealBuilder;
import org.example.spring.daos.mysql.items.builder.TMealFeeItemBuilder;
import org.example.spring.daos.mysql.items.dao.TMealDao;
import org.example.spring.daos.mysql.items.dao.TMealFeeItemDao;
import org.example.spring.daos.mysql.items.repository.TFeeItemRepository;
import org.example.spring.daos.mysql.items.repository.TMealRepository;
import org.example.spring.daos.mysql.items.table.dto.TFeeItemDTO;
import org.example.spring.daos.mysql.items.table.dto.TMealDTO;
import org.example.spring.daos.mysql.items.table.dto.TMealFeeItemDTO;
import org.example.spring.daos.mysql.items.table.po.TMeal;
import org.example.spring.daos.mysql.items.table.query.TMealQuery;
import org.example.spring.daos.mysql.items.table.vo.TMealVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TMealRepositoryImpl implements TMealRepository {
    private final TMealBuilder mealBuilder;
    private final TMealDao mealDao;
    private final TMealFeeItemBuilder mealFeeItemBuilder;
    private final TMealFeeItemDao mealFeeItemDao;
    private final TFeeItemRepository feeItemRepository;

    @Override
    public void save(TMealVo vo) {
        TMeal entity = mealBuilder.build(vo);
        mealDao.save(entity);
        mealFeeItemDao.saveBatch(mealFeeItemBuilder.build(entity.getId(), vo.getFeeItemIds()));
    }

    @Override
    public void update(TMealVo vo) {
        TMeal meal = mealBuilder.build(vo);
        Optional<TMeal> optional = mealDao.getByIdOpt(meal.getId());
        if (optional.isPresent()) {
            TMeal tMeal = optional.get();
            mealBuilder.copy(meal, tMeal);
            mealDao.update(tMeal);
            mealFeeItemDao.deleteByMealId(meal.getId());
            mealFeeItemDao.saveBatch(mealFeeItemBuilder.build(meal.getId(), vo.getFeeItemIds()));
        }
    }

    @Override
    public void delete(Long id) {
        mealDao.deleteById(id);
        mealFeeItemDao.deleteByMealId(id);
    }

    @Override
    public void delete(Long... ids) {
        mealDao.deleteByIds(ids);
        mealFeeItemDao.deleteByMealIds(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        mealDao.deleteByIds(ids);
        mealDao.deleteByIds(ids);
    }

    @Override
    public TMealDTO get(Long id) {
        return mealBuilder.build(mealDao.getById(id));
    }

    @Override
    public Optional<TMealDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TMealDTO queryOne(TMealQuery query) {
        return mealBuilder.build(mealDao.queryOne(query));
    }

    @Override
    public TMealDTO selectOne(TMealQuery query) {
        return mealBuilder.build(mealDao.selectOne(query));
    }

    @Override
    public Optional<TMealDTO> selectOneOpt(TMealQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<TMealDTO> queryOneOpt(TMealQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public TMealDTO queryFirst(TMealQuery query) {
        return mealBuilder.build(mealDao.queryFirst(query));
    }

    @Override
    public Optional<TMealDTO> queryFirstOpt(TMealQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TMealDTO selectFirst(TMealQuery query) {
        return mealBuilder.build(mealDao.selectFirst(query));
    }

    @Override
    public Optional<TMealDTO> selectFirstOpt(TMealQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TMealDTO> queryList(TMealQuery query) {
        return mealBuilder.build(mealDao.queryList(query));
    }

    @Override
    public List<TMealDTO> selectList(TMealQuery query) {
        return mealBuilder.build(mealDao.selectList(query));
    }

    @Override
    public Stream<TMealDTO> queryStream(TMealQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<TMealDTO> selectStream(TMealQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TMealDTO> queryTop(TMealQuery query) {
        return mealBuilder.build(mealDao.queryTop(query));
    }

    @Override
    public List<TMealDTO> selectTop(TMealQuery query) {
        return mealBuilder.build(mealDao.selectTop(query));
    }

    @Override
    public Stream<TMealDTO> queryTopStream(TMealQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public Stream<TMealDTO> selectTopStream(TMealQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TMealDTO> selectPage(TMealQuery query) {
        return mealBuilder.build(mealDao.selectPage(query));
    }

    @Override
    public IPageData<TMealDTO> queryPage(TMealQuery query) {
        return mealBuilder.build(mealDao.queryPage(query));
    }

    @Override
    public TMealFeeItemDTO getDetails(Long id) {
        TMealDTO tMealDTO = get(id);
        List<TFeeItemDTO> items = feeItemRepository.queryListByMealId(id);
        return mealBuilder.build(tMealDTO, );
    }
}