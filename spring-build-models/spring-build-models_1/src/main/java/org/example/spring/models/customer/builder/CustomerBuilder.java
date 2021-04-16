package org.example.spring.models.customer.builder;

import org.example.spring.infrastructures.commons.BaseBuilder;
import org.example.spring.models.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.customer.entity.query.CustomerQuery;
import org.example.spring.models.customer.entity.result.Customer;
import org.example.spring.models.customer.entity.result.CustomerContract;
import org.example.spring.models.customer.entity.vo.CustomerContractVo;
import org.example.spring.models.customer.entity.vo.CustomerVo;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerContract;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.*;

import java.util.List;

@Mapper(config = BaseBuilder.class)
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

}
