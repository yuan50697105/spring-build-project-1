package org.example.spring.repositories.customer.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.mysql.table.po.TSellerInfo;
import org.example.spring.repositories.customer.mysql.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
