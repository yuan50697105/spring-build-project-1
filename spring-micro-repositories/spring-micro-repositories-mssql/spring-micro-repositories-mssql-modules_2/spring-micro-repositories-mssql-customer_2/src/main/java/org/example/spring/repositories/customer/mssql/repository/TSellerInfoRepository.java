package org.example.spring.repositories.customer.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.mssql.table.po.TSellerInfo;
import org.example.spring.repositories.customer.mssql.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TSellerInfoVo;

public interface TSellerInfoRepository extends IBaseRepository<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
}
