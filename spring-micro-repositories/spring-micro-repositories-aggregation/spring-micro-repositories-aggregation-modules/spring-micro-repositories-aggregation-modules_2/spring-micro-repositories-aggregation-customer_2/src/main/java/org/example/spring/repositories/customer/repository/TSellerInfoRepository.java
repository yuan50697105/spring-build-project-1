package org.example.spring.repositories.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.table.po.TSellerInfo;
import org.example.spring.repositories.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
