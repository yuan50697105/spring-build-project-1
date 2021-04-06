package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.MealInfoQuery;
import org.example.modules.repository.mysql.entity.result.MealInfo;
import org.example.modules.repository.mysql.entity.result.MealInfoDetails;
import org.example.modules.repository.mysql.entity.vo.MealInfoFormVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface MealInfoRepository extends IBaseRepository<MealInfo, MealInfoFormVo, MealInfoDetails, MealInfoQuery> {
}
