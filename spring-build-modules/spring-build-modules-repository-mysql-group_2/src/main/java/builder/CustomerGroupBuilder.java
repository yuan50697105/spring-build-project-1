package builder;

import org.example.modules.repository.mysql.entity.po.TCustomerGroup;
import org.example.modules.repository.mysql.entity.query.CustomerGroupQuery;
import org.example.modules.repository.mysql.entity.query.TCustomerGroupQuery;
import org.example.modules.repository.mysql.entity.result.CustomerGroup;
import org.example.modules.repository.mysql.entity.vo.CustomerGroupVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerGroupBuilder {
    TCustomerGroup create(CustomerGroupVo customerGroupVo);

    void copy(CustomerGroupVo customerGroupVo,@MappingTarget TCustomerGroup customerGroup);

    CustomerGroup create(TCustomerGroup customerGroup);

    TCustomerGroupQuery create(CustomerGroupQuery customerGroupQuery);

    List<CustomerGroup> create(List<TCustomerGroup> queryList);

    IPageData<CustomerGroup> create(IPageData<TCustomerGroup> data);
}
