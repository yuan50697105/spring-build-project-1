package org.example.spring.repositories.clients.dubbo.customer.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SellerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.po.SellerInfo;
import org.example.spring.repositories.commons.entity.customer.query.SellerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SellerInfoVo;

public interface SellerInfoDubboRepository extends CommonsDubboRepository<SellerInfo, SellerInfoVo, SellerInfoDTO, SellerInfoQuery> {
}
