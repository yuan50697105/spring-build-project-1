package builder;

import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.query.TCustomerInfoQuery;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerInfoBuilder {
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TCustomerInfo generateCustomer(CustomerInfoVo customer);


    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    void copyCustomer(CustomerInfoVo customer, @MappingTarget TCustomerInfo tCustomerInfo);

    @Mapping(target = "version", ignore = true)
    CustomerInfo generateCustomerResult(TCustomerInfo customerInfo);

    TCustomerInfoQuery generateCustomerQuery(CustomerInfoQuery customerInfoQuery);

    List<CustomerInfo> generateCustomerResult(List<TCustomerInfo> customerInfo);

    IPageData<CustomerInfo> generateCustomerResult(IPageData<TCustomerInfo> customerInfo);
}
