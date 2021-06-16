package org.example.spring.repositories.clients.customer.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SellerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.SellerInfo;
import org.example.spring.repositories.commons.entity.customer.query.SellerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SellerInfoVo;

public interface SellerInfoRepository extends CommonsRepository<SellerInfo, SellerInfoVo, SellerInfoDTO, SellerInfoQuery> {
}
