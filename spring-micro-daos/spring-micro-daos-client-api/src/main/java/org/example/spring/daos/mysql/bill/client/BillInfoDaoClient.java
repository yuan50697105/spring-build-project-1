package org.example.spring.daos.mysql.bill.client;

import org.example.spring.daos.mysql.bill.entity.dto.BillInfoDTO;
import org.example.spring.daos.mysql.bill.entity.dto.BillInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping("bill/info/dao")
public interface BillInfoDaoClient {
    @PostMapping
    void save(@RequestBody BillInfoVo vo);

    @PutMapping
    void update(@RequestBody BillInfoVo vo);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    BillInfoDTO get(@PathVariable Long id);

    @GetMapping("getOpt/{id}")
    Optional<BillInfoDTO> getOpt(@PathVariable Long id);

    @GetMapping("/{id}/details")
    BillInfoDetailsDTO getDetails(@PathVariable Long id);

    @GetMapping("query/one")
    BillInfoDTO queryOne(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/one")
    BillInfoDTO selectOne(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/one/opt")
    Optional<BillInfoDTO> queryOneOpt(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/one/opt")
    Optional<BillInfoDTO> selectOneOpt(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/first")
    BillInfoDTO queryFirst(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/first")
    BillInfoDTO selectFirst(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/first/opt")
    Optional<BillInfoDTO> queryFirstOpt(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/first/opt")
    Optional<BillInfoDTO> selectFirstOpt(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/list")
    List<BillInfoDTO> queryList(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/list")
    List<BillInfoDTO> selectList(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/stream")
    Stream<BillInfoDTO> queryStream(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/stream")
    Stream<BillInfoDTO> selectStream(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/top")
    List<BillInfoDTO> queryTop(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/top")
    List<BillInfoDTO> selectTop(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/top/stream")
    Stream<BillInfoDTO> queryTopStream(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/top/stream")
    Stream<BillInfoDTO> selectTopStream(@SpringQueryMap BillInfoQuery query);

    @GetMapping("query/page")
    IPageData<BillInfoDTO> queryPage(@SpringQueryMap BillInfoQuery query);

    @GetMapping("select/page")
    IPageData<BillInfoDTO> selectPage(BillInfoQuery query);
}
