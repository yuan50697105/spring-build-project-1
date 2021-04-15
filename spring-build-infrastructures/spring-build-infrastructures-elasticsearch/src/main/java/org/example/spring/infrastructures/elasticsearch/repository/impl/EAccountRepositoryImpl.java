package org.example.spring.infrastructures.elasticsearch.repository.impl;

import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.example.spring.infrastructures.elasticsearch.dao.EAccountDao;
import org.example.spring.infrastructures.elasticsearch.entity.EAccount;
import org.example.spring.infrastructures.elasticsearch.entity.EAccountQuery;
import org.example.spring.infrastructures.elasticsearch.repository.EAccountRepository;
import org.example.spring.plugins.commons.entity.query.OrderTypeEnum;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EAccountRepositoryImpl implements EAccountRepository {
    private final EAccountDao accountDao;
    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    public EAccountRepositoryImpl(EAccountDao accountDao, ElasticsearchRestTemplate elasticsearchRestTemplate) {
        this.accountDao = accountDao;
        this.elasticsearchRestTemplate = elasticsearchRestTemplate;
    }


    @Override
    public List<EAccount> findAllByQuery(EAccountQuery accountQuery, Pageable pageable) {
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withPageable(pageable);
        FieldSortBuilder sortBuilder = null;
        if (accountQuery.getOrderType().equals(OrderTypeEnum.asc)) {
            sortBuilder = SortBuilders.fieldSort(accountQuery.getOrder()).order(SortOrder.ASC);
        } else {
            sortBuilder = SortBuilders.fieldSort(accountQuery.getOrder()).order(SortOrder.DESC);
        }
        nativeSearchQueryBuilder.withSort(sortBuilder);
        return elasticsearchRestTemplate.search(nativeSearchQueryBuilder.build(), EAccount.class)
                .stream()
                .map(SearchHit::getContent)
                .collect(Collectors.toList());
    }

    @Override
    public List<Long> findIdsByQuery(EAccountQuery query, Pageable pageable) {
        return findAllByQuery(query, pageable).stream().map(EAccount::getId).collect(Collectors.toList());
    }

    @Override
    public void save(EAccount account) {
        elasticsearchRestTemplate.save(account);
    }
}