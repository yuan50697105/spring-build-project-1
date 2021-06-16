package org.example.spring.repositories.clients.dubbo.customer.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.dto.SalesRecordDTO;
import org.example.spring.repositories.commons.entity.customer.po.CustomerContract;
import org.example.spring.repositories.commons.entity.customer.po.SalesRecord;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.query.SalesRecordQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;
import org.example.spring.repositories.commons.entity.customer.vo.SalesRecordVo;

public interface SalesRecordDubboRepository extends CommonsDubboRepository<SalesRecord, SalesRecordVo, SalesRecordDTO, SalesRecordQuery> {
}
