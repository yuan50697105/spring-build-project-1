package org.example.spring.repositories.customer.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.oracle.table.po.TSellerInfo;
import org.example.spring.repositories.customer.oracle.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
