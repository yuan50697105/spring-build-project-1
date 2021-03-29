package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.CustomerHealthArchivesQuery;
import org.example.modules.repository.mysql.entity.result.CustomerHealthArchives;
import org.example.modules.repository.mysql.entity.vo.CustomerHealthArchivesFormVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface CustomerHealthArchivesRepository extends IBaseRepository<CustomerHealthArchives, CustomerHealthArchivesFormVo, CustomerHealthArchives, CustomerHealthArchivesQuery> {
}
