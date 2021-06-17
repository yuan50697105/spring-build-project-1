package org.example.spring.repositories.mysql.patient.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mysql.patient.table.dto.TPatientCheckItemDTO;
import org.example.spring.repositories.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.repositories.mysql.patient.table.vo.TPatientCheckItemVo;

public interface TPatientCheckItemRepository extends IBaseRepository<TPatientCheckItem, TPatientCheckItemDTO, TPatientCheckItemVo, TPatientCheckItemQuery> {
}
