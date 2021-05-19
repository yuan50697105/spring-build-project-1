package org.example.spring.daos.mysql.bill.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.bill.builder.BillSubInfoClientBuilder;
import org.example.spring.daos.mysql.bill.entity.dto.BillSubInfoDTO;
import org.example.spring.daos.mysql.bill.entity.dto.BillSubInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillSubInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillSubInfoVo;
import org.example.spring.daos.mysql.bill.repository.TBillSubInfoRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@DubboService
@AllArgsConstructor
public class BillSubInfoDaoClientImpl implements BillSubInfoDaoClient {
    private final BillSubInfoClientBuilder billSubInfoClientBuilder;
    private final TBillSubInfoRepository billSubInfoRepository;

    @Override
    @GlobalTransactional
    public void save(BillSubInfoVo vo) {
        billSubInfoRepository.save(billSubInfoClientBuilder.build(vo));
    }

    @Override
    @GlobalTransactional
    public void update(BillSubInfoVo vo) {
        billSubInfoRepository.update(billSubInfoClientBuilder.build(vo));
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
    public BillSubInfoDTO get(Long id) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.get(id));
    }

    @Override
    public Optional<BillSubInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public BillSubInfoDetailsDTO getDetails(Long id) {
        return billSubInfoClientBuilder.build2(billSubInfoRepository.getDetails(id));
    }

    @Override
    public Optional<BillSubInfoDetailsDTO> getDetailsOpt(Long id) {
        return Optional.ofNullable(getDetails(id));
    }

    @Override
    public BillSubInfoDTO queryOne(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.queryOne(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public BillSubInfoDTO selectOne(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.selectOne(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public Optional<BillSubInfoDTO> queryOneOpt(BillSubInfoQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<BillSubInfoDTO> selectOneOpt(BillSubInfoQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public BillSubInfoDTO queryFirst(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.queryFirst(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public BillSubInfoDTO selectFirst(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.selectFirst(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public Optional<BillSubInfoDTO> queryFirstOpt(BillSubInfoQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public Optional<BillSubInfoDTO> selectFirstOpt(BillSubInfoQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public List<BillSubInfoDTO> queryList(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.queryList(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public List<BillSubInfoDTO> selectList(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.selectList(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public Stream<BillSubInfoDTO> queryStream(BillSubInfoQuery query) {
        return queryList(query).stream();
    }

    @Override
    public Stream<BillSubInfoDTO> selectStream(BillSubInfoQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<BillSubInfoDTO> queryTop(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.queryTop(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public List<BillSubInfoDTO> selectTop(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.selectTop(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public Stream<BillSubInfoDTO> queryTopStream(BillSubInfoQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public Stream<BillSubInfoDTO> selectTopStream(BillSubInfoQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<BillSubInfoDTO> queryPage(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.queryPage(billSubInfoClientBuilder.build(query)));
    }

    @Override
    public IPageData<BillSubInfoDTO> selectPage(BillSubInfoQuery query) {
        return billSubInfoClientBuilder.build(billSubInfoRepository.selectPage(billSubInfoClientBuilder.build(query)));
    }
}