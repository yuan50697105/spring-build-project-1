package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.ITDepartment;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;
import org.example.spring.infrastructures.mysql.auth.utils.CopyUtils;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface AuthClientBuilder {
    TDepartment createForSave(ITDepartment department);

    default void copy(ITDepartment department, TDepartment tDepartment) {
        if (department != null) {
            CopyUtils.copyCommons(department, tDepartment);
        }
    }
}
