package org.example.spring.repositories.customer.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.postgres.table.po.TSellerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
