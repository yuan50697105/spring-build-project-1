package org.example.spring.daos.mysql.bill.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.bill.builder.BillInfoClientBuilder;
import org.example.spring.daos.mysql.bill.entity.dto.BillInfoDTO;
import org.example.spring.daos.mysql.bill.entity.dto.BillInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillInfoVo;
import org.example.spring.daos.mysql.bill.repository.TBillInfoRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@DubboService
@AllArgsConstructor
public class BillInfoDaoClientImpl implements BillInfoDaoClient {
    private final BillInfoClientBuilder billInfoClientBuilder;
    private final TBillInfoRepository billInfoRepository;

    @Override
    public void save(BillInfoVo vo) {
        billInfoRepository.save(billInfoClientBuilder.build(vo));
    }

    @Override
    public void update(BillInfoVo vo) {
        billInfoRepository.update(billInfoClientBuilder.build(vo));
    }

    @Override
    public void delete(Long id) {
        throw new RuntimeException("不支持");
    }

    @Override
    public void delete(List<Long> ids) {
        throw new RuntimeException("不支持");
    }

    @Override
    public BillInfoDTO get(Long id) {
        return billInfoClientBuilder.build(billInfoRepository.get(id));
    }

    @Override
    public BillInfoDetailsDTO getDetails(Long id) {
        return billInfoClientBuilder.build2(billInfoRepository.getDetails(id));
    }

    @Override
    public BillInfoDTO queryOne(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.queryOne(billInfoClientBuilder.build(query)));
    }

    @Override
    public BillInfoDTO selectOne(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.selectOne(billInfoClientBuilder.build(query)));
    }

    @Override
    public Optional<BillInfoDTO> queryOneOpt(BillInfoQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<BillInfoDTO> selectOneOpt(BillInfoQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public BillInfoDTO queryFirst(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.queryFirst(billInfoClientBuilder.build(query)));
    }

    @Override
    public BillInfoDTO selectFirst(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.selectFirst(billInfoClientBuilder.build(query)));
    }

    @Override
    public Optional<BillInfoDTO> queryFirstOpt(BillInfoQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public Optional<BillInfoDTO> selectFirstOpt(BillInfoQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<BillInfoDTO> queryList(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.queryList(billInfoClientBuilder.build(query)));
    }

    @Override
    public List<BillInfoDTO> selectList(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.selectList(billInfoClientBuilder.build(query)));
    }

    @Override
    public Stream<BillInfoDTO> queryStream(BillInfoQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<BillInfoDTO> selectStream(BillInfoQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<BillInfoDTO> queryTop(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.queryTop(billInfoClientBuilder.build(query)));
    }

    @Override
    public List<BillInfoDTO> selectTop(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.selectTop(billInfoClientBuilder.build(query)));
    }

    @Override
    public Stream<BillInfoDTO> queryTopStream(BillInfoQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public Stream<BillInfoDTO> selectTopStream(BillInfoQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<BillInfoDTO> queryPage(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.queryPage(billInfoClientBuilder.build(query)));
    }

    @Override
    public IPageData<BillInfoDTO> selectPage(BillInfoQuery query) {
        return billInfoClientBuilder.build(billInfoRepository.selectPage(billInfoClientBuilder.build(query)));
    }
}