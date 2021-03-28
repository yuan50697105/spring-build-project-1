package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TCustomerHealthArchives;
import org.example.modules.repository.mysql.entity.query.CustomerHealthArchivesQuery;
import org.example.modules.repository.mysql.entity.query.TCustomerHealthArchivesQuery;
import org.example.modules.repository.mysql.entity.result.CustomerHealthArchivesResult;
import org.example.modules.repository.mysql.entity.vo.ArchivesVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArchivesBuilder {
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TCustomerHealthArchives createHealthArchives(ArchivesVo archives);

    void copyHealthArchiver(ArchivesVo archives, @MappingTarget TCustomerHealthArchives healthArchives);

    CustomerHealthArchivesResult createHealthArchives(TCustomerHealthArchives healthArchives);

    TCustomerHealthArchivesQuery createHealthArchivesQuery(CustomerHealthArchivesQuery customerHealthArchivesQuery);

    List<CustomerHealthArchivesResult> createHealthArchives(List<TCustomerHealthArchives> healthArchives);

    IPageData<CustomerHealthArchivesResult> createHealthArchives(IPageData<TCustomerHealthArchives> healthArchives);
}
