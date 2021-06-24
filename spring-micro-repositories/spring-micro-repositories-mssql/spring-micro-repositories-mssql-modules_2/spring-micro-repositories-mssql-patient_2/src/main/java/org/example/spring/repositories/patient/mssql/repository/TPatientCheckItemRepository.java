package org.example.spring.repositories.patient.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mssql.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.mssql.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.mssql.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
