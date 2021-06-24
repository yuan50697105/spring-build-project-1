package org.example.spring.repositories.postgres.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.postgres.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.postgres.customer.table.po.TSellerInfo;
import org.example.spring.repositories.postgres.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.postgres.customer.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
