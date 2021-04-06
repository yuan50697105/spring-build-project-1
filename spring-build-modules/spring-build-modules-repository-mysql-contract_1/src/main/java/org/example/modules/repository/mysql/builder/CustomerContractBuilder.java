package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.table.po.TCustomerContract;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.modules.repository.mysql.table.query.TCustomerContractQuery;
import org.example.modules.repository.mysql.entity.result.CustomerContract;
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

    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TCustomerContract createCustomerContract(CustomerContractVo customerContractVo);

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)

    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    void copy(CustomerContractVo formVo, @MappingTarget TCustomerContract customerContract);

    CustomerContract createCustomerContractVo(TCustomerContract customerContract);

    TCustomerContractQuery createCustomerContractQuery(CustomerContractQuery customerContractQuery);

    List<CustomerContract> createCustomerContractVos(List<TCustomerContract> contracts);

    IPageData<CustomerContract> createCustomerContractVos(IPageData<TCustomerContract> data);
}
