package org.example.spring.repositories.feign.auth.clients;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.commons.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.auth.po.Department;
import org.example.spring.repositories.commons.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.auth.vo.DepartmentVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping("department/repository/client")
public interface DepartmentRepositoryClient extends CommonsFeignClient<Department,DepartmentVo,DepartmentDTO,DepartmentQuery>, DepartmentRepository {

}
