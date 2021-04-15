package org.example.spring.infrastructures.elasticsearch.repository;

import org.example.spring.infrastructures.elasticsearch.entity.EAccount;
import org.example.spring.infrastructures.elasticsearch.entity.EAccountQuery;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EAccountRepository {
    List<EAccount> findAllByQuery(EAccountQuery account, Pageable pageable);

    List<Long> findIdsByQuery(EAccountQuery query, Pageable pageable);
}
