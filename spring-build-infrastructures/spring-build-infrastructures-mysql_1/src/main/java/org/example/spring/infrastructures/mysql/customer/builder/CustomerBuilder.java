package org.example.spring.infrastructures.mysql.customer.builder;

import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.Customer;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContract;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerCommonsVo;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerContractVo;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerVo;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerCommons;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerContract;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerBuilder {
    TCustomerInfo buildCustomerInfo(CustomerVo customer);

    void copyCustomerInfo(CustomerVo customer, @MappingTarget TCustomerInfo tCustomerInfo);

    TCustomerInfoQuery buildCustomerInfoQuery(CustomerQuery customerQuery);

    Customer buildCustomerInfoResult(TCustomerInfo customerInfo);

    List<Customer> buildCustomerInfoResult(List<TCustomerInfo> customerInfo);

    IPageData<Customer> buildCustomerInfoResult(IPageData<TCustomerInfo> customerInfo);

    TCustomerContract buildCustomerContract(CustomerContractVo contract);

    void copyCustomerContract(CustomerContractVo contract, @MappingTarget TCustomerContract tCustomerContract);

    CustomerContract buildCustomerContractResult(TCustomerContract contract);

    TCustomerContractQuery buildCustomerContractQuery(CustomerContractQuery customerContractQuery);

    List<CustomerContract> buildCustomerContractResult(List<TCustomerContract> contract);

    IPageData<CustomerContract> buildCustomerContractResult(IPageData<TCustomerContract> contract);

    TCustomerCommons buildCustomerCommonsResult(CustomerCommonsVo commons);

    void copyCustomerCommons(CustomerCommonsVo commons, @MappingTarget TCustomerCommons tCustomerCommons);
}
