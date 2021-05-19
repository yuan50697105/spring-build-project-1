package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.builder.TDepartmentBuilder;
import org.example.spring.daos.mysql.auth.builder.TDepartmentRoleBuilder;
import org.example.spring.daos.mysql.auth.dao.TDepartmentDao;
import org.example.spring.daos.mysql.auth.dao.TDepartmentRoleDao;
import org.example.spring.daos.mysql.auth.repository.TDepartmentRepository;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.po.TDepartment;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@Transactional
@AllArgsConstructor
public class TDepartmentRepositoryImpl implements TDepartmentRepository {
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleBuilder departmentRoleBuilder;
    private final TDepartmentBuilder departmentBuilder;
    private final TDepartmentRoleDao departmentRoleDao;

    @Override
    public void save(TDepartmentVo vo) {
        TDepartment entity = departmentBuilder.toPo(vo);
        departmentDao.save(entity);
        departmentRoleBuilder.buildRoles(entity.getId(), vo.getRoleIds());
    }

    @Override
    public void update(TDepartmentVo vo) {
        TDepartment department = departmentBuilder.toPo(vo);
        Optional<TDepartment> optional = departmentDao.getByIdOpt(department.getId());
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            departmentBuilder.copy(department, tDepartment);
            departmentDao.update(tDepartment);
            departmentRoleDao.removeByDepartmentId(department.getId());
            departmentRoleDao.saveBatch(departmentRoleBuilder.buildRoles(department.getId(), vo.getRoleIds()));
        }
    }

    @Override
    public void delete(Long id) {
        departmentDao.deleteById(id);
        departmentRoleDao.removeByDepartmentId(id);
    }

    @Override
    public void delete(Long... ids) {
        departmentDao.removeByIds(ids);
        departmentRoleDao.removeByDepartmentIds(Arrays.asList(ids));
    }

    @Override
    public void delete(List<Long> ids) {
        departmentDao.deleteByIds(ids);
        departmentRoleDao.removeByDepartmentIds(ids);
    }

    @Override
    public TDepartmentDTO get(Long id) {
        return departmentBuilder.toDTO(departmentDao.getById(id));
    }

    @Override
    public Optional<TDepartmentDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TDepartmentDTO queryOne(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryOne(query));
    }

    @Override
    public TDepartmentDTO selectOne(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.selectOne(query));
    }

    @Override
    public Optional<TDepartmentDTO> selectOneOpt(TDepartmentQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public Optional<TDepartmentDTO> queryOneOpt(TDepartmentQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public TDepartmentDTO queryFirst(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryFirst(query));
    }

    @Override
    public Optional<TDepartmentDTO> queryFirstOpt(TDepartmentQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TDepartmentDTO selectFirst(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.selectFirst(query));
    }

    @Override
    public Optional<TDepartmentDTO> selectFirstOpt(TDepartmentQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TDepartmentDTO> queryList(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryList(query));
    }

    @Override
    public List<TDepartmentDTO> selectList(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.selectList(query));
    }

    @Override
    public Stream<TDepartmentDTO> queryStream(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryListStream(query));
    }

    @Override
    public Stream<TDepartmentDTO> selectStream(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.selectListStream(query));
    }

    @Override
    public List<TDepartmentDTO> queryTop(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryTop(query));
    }

    @Override
    public List<TDepartmentDTO> selectTop(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.selectTop(query));
    }

    @Override
    public Stream<TDepartmentDTO> queryTopStream(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryTopStream(query));
    }

    @Override
    public Stream<TDepartmentDTO> selectTopStream(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryTopStream(query));
    }

    @Override
    public IPageData<TDepartmentDTO> selectPage(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.selectPage(query));
    }

    @Override
    public IPageData<TDepartmentDTO> queryPage(TDepartmentQuery query) {
        return departmentBuilder.toDTO(departmentDao.queryPage(query));
    }

    @Override
    public boolean validateDelete(List<Long> ids) {
        return departmentDao.validateDelete(ids);
    }
}