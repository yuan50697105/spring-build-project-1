package org.example.spring.models.postgresql.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.spring.infrastructures.postgresql.auth.dao.TDepartmentDao;
import org.example.spring.infrastructures.postgresql.auth.dao.TDepartmentRoleDao;
import org.example.spring.infrastructures.postgresql.auth.dao.TRoleDao;
import org.example.spring.infrastructures.postgresql.auth.table.po.TDepartment;
import org.example.spring.infrastructures.postgresql.auth.table.po.TDepartmentRole;
import org.example.spring.infrastructures.postgresql.auth.table.query.TDepartmentQuery;
import org.example.spring.models.postgresql.auth.builder.AuthModelBuilder;
import org.example.spring.models.postgresql.auth.entity.dto.DepartmentNode;
import org.example.spring.models.postgresql.auth.entity.query.DepartmentQuery;
import org.example.spring.models.postgresql.auth.entity.result.Department;
import org.example.spring.models.postgresql.auth.entity.result.DepartmentDetails;
import org.example.spring.models.postgresql.auth.entity.vo.DepartmentModelVo;
import org.example.spring.models.postgresql.auth.repository.DepartmentRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class DepartmentRepositoryImpl extends IBaseRepositoryImpl<Department, DepartmentModelVo, DepartmentDetails, DepartmentQuery> implements DepartmentRepository {
    private final AuthModelBuilder authModelBuilder;
    private final TDepartmentDao departmentDao;
    private final TRoleDao roleDao;
    private final TDepartmentRoleDao departmentRoleDao;
    private final ThreadPoolExecutor executor;

    @Override
    public Long saveWithId(DepartmentModelVo departmentModelVo) {
        TDepartment department = departmentModelVo.getDepartment();
        List<Long> roleIds = departmentModelVo.getRoleIds();
        departmentDao.save(department);
        if (ObjectUtil.isNotEmpty(roleIds)) {
            executor.submit(() -> saveRole(roleIds, department.getId()));
        }
        return department.getId();
    }

    private void saveRole(List<Long> rolesRoleIds, Long id) {
        List<Long> roleIds = roleDao.listRoleIdsByRoleIds(rolesRoleIds);
        List<TDepartmentRole> departmentRoleList = roleIds.stream().map(roleId -> authModelBuilder.buildDepartmentRole(id, roleId)).collect(Collectors.toList());
        departmentRoleDao.saveBatch(departmentRoleList);
    }

    @Override
    public void update(DepartmentModelVo departmentModelVo) {
        Long id = departmentModelVo.getId();
        List<Long> roleIds = departmentModelVo.getRoleIds();
        TDepartment department = departmentModelVo.getDepartment();
        Optional<TDepartment> optional = departmentDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            authModelBuilder.copyDepartment(department, tDepartment);
            departmentDao.updateById(tDepartment);
            if (ObjectUtil.isNotEmpty(roleIds)) {
                executor.submit(() -> updateRole(department.getId(), roleIds));
            }
        }
    }

    private void updateRole(Long id, List<Long> roleIds) {
        departmentRoleDao.removeByDepartmentId(id);
        saveRole(roleIds,id);
    }

    @Override
    public void delete(List<Long> ids) {
        validateChildDepartment(ids);
        departmentDao.removeByIds(ids);
        departmentRoleDao.removeByDepartmentIds(ids);
    }

    @Override
    public Department getById(Long id) {
        return authModelBuilder.buildDepartmentResult(departmentDao.getById(id));
    }

    @SneakyThrows
    private void validateChildDepartment(List<Long> ids) {
        @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming") boolean existChildByPIds = departmentDao.existChildByPIds(ids);
        if (existChildByPIds) {
            throw new ValidationException("存在子部门使用");
        }
    }

    @Override
    public DepartmentDetails getDetailsById(Long id) {
        DepartmentDetails details = new DepartmentDetails();
        TDepartment department = departmentDao.getById(id);
        details.setDepartment(authModelBuilder.buildDepartmentResult(department));
        details.setRoles(authModelBuilder.buildRoleResult(departmentRoleDao.listRolesByDepartmentId(id)));
        return details;
    }

    @Override
    public IPageData<Department> queryPage(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authModelBuilder.buildDepartmentQuery(departmentQuery);
        IPageData<TDepartment> data = departmentDao.queryPage(query);
        return authModelBuilder.buildDepartmentResult(data);
    }

    @Override
    public List<Department> queryList(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authModelBuilder.buildDepartmentQuery(departmentQuery);
        List<TDepartment> data = departmentDao.queryList(query);
        return authModelBuilder.buildDepartmentResult(data);
    }

    @Override
    public Department queryOne(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authModelBuilder.buildDepartmentQuery(departmentQuery);
        Optional<TDepartment> data = departmentDao.queryFirst(query);
        return authModelBuilder.buildDepartmentResult(data.orElse(new Department()));
    }

    @Override
    public List<Tree<Long>> listTree(DepartmentQuery query) {
        TDepartmentQuery buildDepartmentQuery = authModelBuilder.buildDepartmentQuery(query);
        List<TDepartment> data = departmentDao.queryList(buildDepartmentQuery);
        List<DepartmentNode> departmentNodes = authModelBuilder.buildDepartmentToDepartmentNode(data);
        return TreeUtil.build(departmentNodes, 0L, (object, treeNode) -> {
            BeanUtil.copyProperties(object, treeNode);
            BeanUtil.beanToMap(object).forEach(treeNode::putExtra);
        });
    }
}