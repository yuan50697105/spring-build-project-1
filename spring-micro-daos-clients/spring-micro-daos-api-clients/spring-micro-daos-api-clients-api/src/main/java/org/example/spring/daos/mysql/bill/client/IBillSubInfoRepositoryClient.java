package org.example.spring.daos.mysql.bill.client;

import org.example.spring.daos.mysql.bill.entity.dto.BillSubInfoDTO;
import org.example.spring.daos.mysql.bill.entity.dto.BillSubInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillSubInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillSubInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping("bill/sub/info/dao")
public interface IBillSubInfoRepositoryClient {
    @PostMapping
    void save(@RequestBody BillSubInfoVo vo);

    @PutMapping
    void update(@RequestBody BillSubInfoVo vo);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping
    void delete(List<Long> ids);

    @GetMapping("/{id}")
    BillSubInfoDTO get(@PathVariable Long id);

    @GetMapping("getOpt/{id}")
    Optional<BillSubInfoDTO> getOpt(@PathVariable Long id);

    @GetMapping("getDetails/{id}")
    BillSubInfoDetailsDTO getDetails(@PathVariable Long id);

    @GetMapping("getDetailsOpt/{id}")
    Optional<BillSubInfoDetailsDTO> getDetailsOpt(@PathVariable Long id);

    @GetMapping("query/one")
    BillSubInfoDTO queryOne(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("select/one")
    BillSubInfoDTO selectOne(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("query/one/opt")
    Optional<BillSubInfoDTO> queryOneOpt(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("select/one/opt")
    Optional<BillSubInfoDTO> selectOneOpt(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("query/first")
    BillSubInfoDTO queryFirst(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("select/first")
    BillSubInfoDTO selectFirst(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("query/first/opt")
    Optional<BillSubInfoDTO> queryFirstOpt(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("select/first/opt")
    Optional<BillSubInfoDTO> selectFirstOpt(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("query/list")
    List<BillSubInfoDTO> queryList(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("select/list")
    List<BillSubInfoDTO> selectList(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("query/stream")
    Stream<BillSubInfoDTO> queryStream(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("select/stream")
    Stream<BillSubInfoDTO> selectStream(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("queryTop")
    List<BillSubInfoDTO> queryTop(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("selectTop")
    List<BillSubInfoDTO> selectTop(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("queryTopStream")
    Stream<BillSubInfoDTO> queryTopStream(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("selectTopStream")
    Stream<BillSubInfoDTO> selectTopStream(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("query/page")
    IPageData<BillSubInfoDTO> queryPage(@SpringQueryMap BillSubInfoQuery query);

    @GetMapping("select/page")
    IPageData<BillSubInfoDTO> selectPage(BillSubInfoQuery query);
}
