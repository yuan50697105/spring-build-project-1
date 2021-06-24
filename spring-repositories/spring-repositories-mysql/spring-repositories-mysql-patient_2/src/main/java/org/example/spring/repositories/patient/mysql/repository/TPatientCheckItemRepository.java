package org.example.spring.repositories.patient.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.patient.mysql.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.patient.mysql.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.patient.mysql.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
