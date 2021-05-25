package org.example.spring.daos.mysql.bill.client;

import org.example.spring.daos.mysql.bill.entity.dto.BillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillItemsInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillItemsInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping("bill/items/info/dao")
public interface IBillItemsInfoRepositoryClient {
    @PostMapping
    void save(@RequestBody BillItemsInfoVo vo);

    @PutMapping
    void update(@RequestBody BillItemsInfoVo vo);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    BillItemsInfoDTO get(@PathVariable Long id);

    @GetMapping("getOpt/{id}")
    Optional<BillItemsInfoDTO> getOpt(@PathVariable Long id);

    @GetMapping("query/one")
    BillItemsInfoDTO queryOne(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("select/one")
    BillItemsInfoDTO selectOne(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("query/one/opt")
    Optional<BillItemsInfoDTO> queryOneOpt(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("select/one/opt")
    Optional<BillItemsInfoDTO> selectOneOpt(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("query/first")
    BillItemsInfoDTO queryFirst(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("select/first")
    BillItemsInfoDTO selectFirst(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("query/first/opt")
    Optional<BillItemsInfoDTO> queryFirstOpt(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("select/first/opt")
    Optional<BillItemsInfoDTO> selectFirstOpt(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("query/list")
    List<BillItemsInfoDTO> queryList(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("select/list")
    List<BillItemsInfoDTO> selectList(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("query/stream")
    Stream<BillItemsInfoDTO> queryStream(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("select/stream")
    Stream<BillItemsInfoDTO> selectStream(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("queryTop")
    List<BillItemsInfoDTO> queryTop(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("selectTop")
    List<BillItemsInfoDTO> selectTop(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("queryTopStream")
    Stream<BillItemsInfoDTO> queryTopStream(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("selectTopStream")
    Stream<BillItemsInfoDTO> selectTopStream(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("query/page")
    IPageData<BillItemsInfoDTO> queryPage(@SpringQueryMap BillItemsInfoQuery query);

    @GetMapping("select/page")
    IPageData<BillItemsInfoDTO> selectPage(BillItemsInfoQuery query);
}
