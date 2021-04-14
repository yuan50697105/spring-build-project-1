package org.example.spring.infrastructures.elasticsearch.repository;

import org.example.spring.infrastructures.elasticsearch.entity.EAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EAccountRepository extends ElasticsearchRepository<EAccount, Long> {
}
