package org.example.spring.repositories.mysql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.mysql.customer.table.po.TSellerInfo;
import org.example.spring.repositories.mysql.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
