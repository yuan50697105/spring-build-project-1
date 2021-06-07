package org.example.spring.repositories.feign.auth.clients;

import org.example.spring.repositories.clients.auth.api.ResourceRepository;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.feign.commons.clients.CommonsFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("resource/repository/client")
public interface ResourceRepositoryClient extends CommonsFeignClient<Resource, ResourceVo, ResourceDTO, ResourceQuery>, ResourceRepository {
}
    
