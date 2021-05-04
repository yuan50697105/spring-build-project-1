package org.example.spring.models.mysql.customer.builder;

import org.example.spring.daos.mysql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.daos.mysql.customer.table.po.TSalesRecord;
import org.example.spring.daos.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.daos.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.daos.mysql.customer.table.query.TSalesRecordQuery;
import org.example.spring.models.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.models.mysql.customer.entity.query.SalesRecordQuery;
import org.example.spring.models.mysql.customer.entity.result.Customer;
import org.example.spring.models.mysql.customer.entity.result.CustomerContract;
import org.example.spring.models.mysql.customer.entity.result.SalesRecord;
import org.example.spring.models.mysql.customer.entity.vo.SalesRecordVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface CustomerModelBuilder {

    void copyCustomerInfo(TCustomerInfo customer, @MappingTarget TCustomerInfo tCustomerInfo);

    TCustomerInfoQuery buildCustomerInfoQuery(CustomerQuery customerQuery);

    Customer buildCustomerInfoResult(TCustomerInfo customerInfo);

    List<Customer> buildCustomerInfoResult(List<TCustomerInfo> customerInfo);

    IPageData<Customer> buildCustomerInfoResult(IPageData<TCustomerInfo> customerInfo);

    void copyCustomerContract(TCustomerContract contract, @MappingTarget TCustomerContract tCustomerContract);

    CustomerContract buildCustomerContractResult(TCustomerContract contract);

    TCustomerContractQuery buildCustomerContractQuery(CustomerContractQuery customerContractQuery);

    List<CustomerContract> buildCustomerContractResult(List<TCustomerContract> contract);

    IPageData<CustomerContract> buildCustomerContractResult(IPageData<TCustomerContract> contract);

    TSalesRecord buildCustomerSalesRecord(SalesRecordVo salesRecordVo);

    void copyCustomerSalesRecord(SalesRecordVo salesRecordVo,@MappingTarget TSalesRecord tSalesRecord);

    SalesRecord buildCustomerSalesRecord(TSalesRecord byId);

    TSalesRecordQuery buildCustomerSalesRecordQuery(SalesRecordQuery salesRecordQuery);

    IPageData<SalesRecord> buildCustomerSalesRecord(IPageData<TSalesRecord> queryPage);

    List<SalesRecord> buildCustomerSalesRecord(List<TSalesRecord> data);
}
