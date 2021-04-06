package org.example.modules.repository.mysql.repository.impl;

import cn.hutool.core.collection.CollUtil;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.MealInfoBuilder;
import org.example.modules.repository.mysql.dao.TMealInfoDao;
import org.example.modules.repository.mysql.dao.TMealItemDao;
import org.example.modules.repository.mysql.entity.vo.MealItemVo;
import org.example.modules.repository.mysql.table.po.TMealInfo;
import org.example.modules.repository.mysql.entity.query.MealInfoQuery;
import org.example.modules.repository.mysql.table.po.TMealItem;
import org.example.modules.repository.mysql.table.query.TMealInfoQuery;
import org.example.modules.repository.mysql.entity.result.MealInfo;
import org.example.modules.repository.mysql.entity.result.MealInfoDetails;
import org.example.modules.repository.mysql.entity.vo.MealInfoFormVo;
import org.example.modules.repository.mysql.entity.vo.MealInfoVo;
import org.example.modules.repository.mysql.repository.MealInfoRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@Transactional
@AllArgsConstructor
public class MealInfoRepositoryImpl extends IBaseRepositoryImpl<MealInfo, MealInfoFormVo, MealInfoDetails, MealInfoQuery> implements MealInfoRepository {
    private final TMealInfoDao mealInfoDao;
    private final TMealItemDao mealItemDao;
    private final MealInfoBuilder mealInfoBuilder;
    @Override
    public void save(MealInfoFormVo mealInfoFormVo) {
        saveWithId(mealInfoFormVo);
    }

    @Override
    public Long saveWithId(MealInfoFormVo mealInfoFormVo) {
        MealInfoVo meal = mealInfoFormVo.getMeal();
        TMealInfo mealInfo = mealInfoBuilder.build(meal);
        mealInfoDao.save(mealInfo);
        List<TMealItem> mealItems = mealInfoBuilder.build(mealInfo, mealInfoFormVo.getItems());
        mealItemDao.saveBatch(mealItems);
        return mealInfo.getId();

    }

    @Override
    public void update(MealInfoFormVo mealInfoFormVo) {
        MealInfoVo meal = mealInfoFormVo.getMeal();
        List<MealItemVo> items = mealInfoFormVo.getItems();
        Long id = meal.getId();
        Optional<TMealInfo> optional = mealInfoDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TMealInfo mealInfo = optional.get();
            mealInfoBuilder.copy(meal, mealInfo);
            mealInfoDao.updateById(mealInfo);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        mealInfoDao.removeByIds(ids);
    }

    @Override
    public MealInfoDetails getById(Long id) {
        MealInfoDetails mealInfoDetails = new MealInfoDetails();
        mealInfoDetails.setMeal(mealInfoBuilder.build(mealInfoDao.getById(id)));
        return mealInfoDetails;
    }

    @Override
    public IPageData<MealInfo> queryPage(MealInfoQuery mealInfoQuery) {
        TMealInfoQuery query = mealInfoBuilder.build(mealInfoQuery);
        IPageData<TMealInfo> data = mealInfoDao.queryPage(query);
        return mealInfoBuilder.build(data);
    }

    @Override
    public List<MealInfo> queryList(MealInfoQuery mealInfoQuery) {
        TMealInfoQuery query = mealInfoBuilder.build(mealInfoQuery);
        List<TMealInfo> data = mealInfoDao.queryList(query);
        return mealInfoBuilder.build(data);
    }

    @Override
    public MealInfo queryOne(MealInfoQuery mealInfoQuery) {
        TMealInfoQuery query = mealInfoBuilder.build(mealInfoQuery);
        TMealInfo data = mealInfoDao.queryOne(query);
        return mealInfoBuilder.build(data);
    }
}