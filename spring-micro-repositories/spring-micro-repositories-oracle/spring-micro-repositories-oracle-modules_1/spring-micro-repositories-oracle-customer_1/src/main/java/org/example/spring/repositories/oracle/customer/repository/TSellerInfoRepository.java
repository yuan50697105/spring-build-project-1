package org.example.spring.repositories.oracle.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.oracle.customer.table.po.TSellerInfo;
import org.example.spring.repositories.oracle.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
