package org.example.spring.infrastructures.mysql.customer.builder;

import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.Customer;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerVo;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TCustomerInfoBuilder {
    TCustomerInfo buildCustomerInfo(CustomerVo customer);

    void copyCustomerInfo(CustomerVo customer,@MappingTarget TCustomerInfo tCustomerInfo);

    TCustomerInfoQuery buildCustomerInfoQuery(CustomerQuery customerQuery);

    Customer buildCustomerInfoResult(TCustomerInfo customerInfo);

    List<Customer> buildCustomerInfoResult(List<TCustomerInfo> customerInfo);

    IPageData<Customer> buildCustomerInfoResult(IPageData<TCustomerInfo> customerInfo);
}
