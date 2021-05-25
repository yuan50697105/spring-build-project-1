package org.example.spring.daos.mysql.bill.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.bill.builder.BillItemsInfoClientBuilder;
import org.example.spring.daos.mysql.bill.entity.dto.BillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillItemsInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillItemsInfoVo;
import org.example.spring.daos.mysql.bill.repository.TBillItemsInfoRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@DubboService
@AllArgsConstructor
public class BillItemsInfoRepositoryClientImpl implements IBillItemsInfoRepositoryClient {
    private final BillItemsInfoClientBuilder billItemsInfoClientBuilder;
    private final TBillItemsInfoRepository billItemsInfoRepository;

    @Override
    @GlobalTransactional
    public void save(BillItemsInfoVo vo) {
        billItemsInfoRepository.save(billItemsInfoClientBuilder.build(vo));
    }

    @Override
    @GlobalTransactional
    public void update(BillItemsInfoVo vo) {
        billItemsInfoRepository.update(billItemsInfoClientBuilder.build(vo));
    }

    @Override
    @GlobalTransactional
    public void delete(Long id) {
        throw new RuntimeException("不支持");
    }

    @Override
    @GlobalTransactional
    public void delete(List<Long> ids) {
        throw new RuntimeException("不支持");
    }

    @Override
    public BillItemsInfoDTO get(Long id) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.get(id));
    }

    @Override
    public Optional<BillItemsInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public BillItemsInfoDTO queryOne(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.queryOne(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public BillItemsInfoDTO selectOne(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.selectOne(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public Optional<BillItemsInfoDTO> queryOneOpt(BillItemsInfoQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<BillItemsInfoDTO> selectOneOpt(BillItemsInfoQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public BillItemsInfoDTO queryFirst(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.queryFirst(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public BillItemsInfoDTO selectFirst(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.selectFirst(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public Optional<BillItemsInfoDTO> queryFirstOpt(BillItemsInfoQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public Optional<BillItemsInfoDTO> selectFirstOpt(BillItemsInfoQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<BillItemsInfoDTO> queryList(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.queryList(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public List<BillItemsInfoDTO> selectList(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.selectList(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public Stream<BillItemsInfoDTO> queryStream(BillItemsInfoQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<BillItemsInfoDTO> selectStream(BillItemsInfoQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<BillItemsInfoDTO> queryTop(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.queryTop(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public List<BillItemsInfoDTO> selectTop(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.selectTop(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public Stream<BillItemsInfoDTO> queryTopStream(BillItemsInfoQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public Stream<BillItemsInfoDTO> selectTopStream(BillItemsInfoQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<BillItemsInfoDTO> queryPage(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.queryPage(billItemsInfoClientBuilder.build(query)));
    }

    @Override
    public IPageData<BillItemsInfoDTO> selectPage(BillItemsInfoQuery query) {
        return billItemsInfoClientBuilder.build(billItemsInfoRepository.selectPage(billItemsInfoClientBuilder.build(query)));
    }
}