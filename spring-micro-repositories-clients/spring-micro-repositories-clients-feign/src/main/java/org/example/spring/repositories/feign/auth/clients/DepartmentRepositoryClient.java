package org.example.spring.repositories.feign.auth.clients;


import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.po.Department;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("department/repository/client")
public interface DepartmentRepositoryClient extends CommonsFeignClient<Department, DepartmentVo, DepartmentDTO, DepartmentQuery>, DepartmentRepository {

}
