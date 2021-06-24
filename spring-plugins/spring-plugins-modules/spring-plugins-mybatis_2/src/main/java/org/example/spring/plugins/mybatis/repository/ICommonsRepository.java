package org.example.spring.plugins.mybatis.repository;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface ICommonsRepository<T, DTO extends T, VO extends T, Q extends BaseQuery> {
    void save(VO vo);

    void save(VO... vo);

    void save(List<VO> vo);

    void saveSelective(VO vo);

    void saveSelective(VO... vo);

    void saveSelective(List<VO> vo);

    void saveSetColumns(VO vo);

    void saveSetColumns(VO... vo);

    void saveSetColumns(List<VO> vo);

    void insert(VO vo);

    void insert(VO... vo);

    void insert(List<VO> vo);

    void insertSelective(VO vo);

    void insertSelective(VO... vo);

    void insertSelective(List<VO> vo);

    void update(VO vo);

    void update(VO... vo);

    void update(List<VO> vo);

    void updateNull(VO vo);

    void updateNull(VO... vo);

    void updateNull(List<VO> vo);

    void modify(VO vo);

    void modify(VO... vo);

    void modify(List<VO> vo);

    void modifyNull(VO vo);

    void modifyNull(VO... vo);

    void modifyNull(List<VO> vo);

    void update(VO vo, Q q);

    void updateNull(VO vo, Q q);

    void modify(VO vo, Q q);

    void modifyNull(VO vo, Q q);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    void remove(Long id);

    void remove(Long... ids);

    void remove(List<Long> ids);

    DTO get(Long id);

    Optional<DTO> getOpt(Long id);

    List<DTO> listByIds(Long... ids);

    List<DTO> listByIds(List<Long> ids);


    DTO queryOne(Q q);

    Optional<DTO> queryOneOpt(Q q);

    DTO queryFirst(Q q);

    Optional<DTO> queryFirstOpt(Q q);

    List<DTO> queryList(Q q);

    Stream<DTO> queryStream(Q q);

    List<DTO> queryTop(Q q);

    Stream<DTO> queryTopStream(Q q);

    IPageData<DTO> queryPage(Q q);

    DTO selectOne(Q q);

    Optional<DTO> selectOneOpt(Q q);

    DTO selectFirst(Q q);

    Optional<DTO> selectFirstOpt(Q q);

    List<DTO> selectList(Q q);

    Stream<DTO> selectStream(Q q);

    List<DTO> selectTop(Q q);

    Stream<DTO> selectTopStream(Q q);

    IPageData<DTO> selectPage(Q q);

    DTO searchOne(Q q);

    Optional<DTO> searchOneOpt(Q q);

    DTO searchFirst(Q q);

    Optional<DTO> searchFirstOpt(Q q);

    List<DTO> searchList(Q q);

    Stream<DTO> searchStream(Q q);

    List<DTO> searchTop(Q q);

    Stream<DTO> searchTopStream(Q q);

    IPageData<DTO> searchPage(Q q);

    DTO findOne(Q q);

    Optional<DTO> findOneOpt(Q q);

    DTO findFirst(Q q);

    Optional<DTO> findFirstOpt(Q q);

    List<DTO> findList(Q q);

    Stream<DTO> findStream(Q q);

    List<DTO> findTop(Q q);

    Stream<DTO> findTopStream(Q q);

    IPageData<DTO> findPage(Q q);
}
