package org.example.spring.repositories.aggregation.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.aggregation.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.aggregation.customer.table.po.TSellerInfo;
import org.example.spring.repositories.aggregation.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.aggregation.customer.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
