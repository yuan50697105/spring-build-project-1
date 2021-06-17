package org.example.spring.repositories.mssql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.mssql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mssql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.mssql.patient.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
