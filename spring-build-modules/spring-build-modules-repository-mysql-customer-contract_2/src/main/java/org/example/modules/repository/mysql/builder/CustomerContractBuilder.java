package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TCustomerContract;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.modules.repository.mysql.entity.query.TCustomerContractQuery;
import org.example.modules.repository.mysql.entity.result.CustomerContractResult;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerContractBuilder {
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TCustomerContract createCustomerContract(CustomerContractVo customerContractVo);

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    void copy(CustomerContractVo formVo, @MappingTarget TCustomerContract customerContract);

    CustomerContractResult createCustomerContractVo(TCustomerContract customerContract);

    TCustomerContractQuery createCustomerContractQuery(CustomerContractQuery customerContractQuery);

    List<CustomerContractResult> createCustomerContractVos(List<TCustomerContract> contracts);

    IPageData<CustomerContractResult> createCustomerContractVos(IPageData<TCustomerContract> data);
}
