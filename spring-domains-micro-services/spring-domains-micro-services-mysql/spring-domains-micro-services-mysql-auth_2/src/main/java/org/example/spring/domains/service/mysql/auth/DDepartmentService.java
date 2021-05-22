package org.example.spring.domains.service.mysql.auth;

import org.example.spring.models.mysql.auth.entity.query.DDepartmentQuery;
import org.example.spring.models.mysql.auth.entity.result.DDepartmentDTO;
import org.example.spring.models.mysql.auth.entity.vo.DDepartmentVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DDepartmentService {

    void save(DDepartmentVo formVo);

    void update(DDepartmentVo formVo);

    void delete(List<Long> ids);

    IPageData<DDepartmentDTO> selectPage(DDepartmentQuery query);

    List<DDepartmentDTO> selectList(DDepartmentQuery query);

    DDepartmentDTO selectOne(DDepartmentQuery query);

    DDepartmentDTO get(Long id);
}
