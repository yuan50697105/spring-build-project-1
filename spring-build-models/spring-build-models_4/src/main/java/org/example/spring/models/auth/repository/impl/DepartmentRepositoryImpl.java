package org.example.spring.models.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.spring.infrastructures.es.auth.entity.po.EDepartment;
import org.example.spring.models.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TDepartmentDao;
import org.example.spring.models.auth.entity.dto.DepartmentNode;
import org.example.spring.models.auth.entity.query.DepartmentQuery;
import org.example.spring.models.auth.entity.result.Department;
import org.example.spring.models.auth.entity.result.DepartmentDetails;
import org.example.spring.models.auth.entity.vo.DepartmentFormVo;
import org.example.spring.models.auth.entity.vo.DepartmentVo;
import org.example.spring.models.auth.repository.DepartmentRepository;
import org.example.spring.infrastructures.es.auth.entity.query.TDepartmentQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class DepartmentRepositoryImpl extends IBaseRepositoryImpl<Department, DepartmentFormVo, DepartmentDetails, DepartmentQuery> implements DepartmentRepository {
    private final AuthBuilder authBuilder;
    private final TDepartmentDao departmentDao;

    @Override
    public Long saveWithId(DepartmentFormVo departmentFormVo) {
        DepartmentVo department = departmentFormVo.getDepartment();
        EDepartment entity = authBuilder.buildAccountDepartment(department);
        departmentDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(DepartmentFormVo departmentFormVo) {
        Long id = departmentFormVo.getId();
        DepartmentVo department = departmentFormVo.getDepartment();
        Optional<EDepartment> optional = departmentDao.getByIdOpt(id);
        if (optional.isPresent()) {
            EDepartment eDepartment = optional.get();
            authBuilder.copyDepartment(department, eDepartment);
            departmentDao.updateById(eDepartment);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        validateChildDepartment(ids);
        departmentDao.removeByIds(ids);
    }

    @SneakyThrows
    private void validateChildDepartment(List<Long> ids) {
        boolean existChildByPIds = departmentDao.existChildByPIds(ids);
        if (existChildByPIds) {
            throw new ValidationException("存在子部门使用");
        }
    }

    @Override
    public DepartmentDetails getById(Long id) {
        DepartmentDetails details = new DepartmentDetails();
        EDepartment department = departmentDao.getById(id);
        details.setDepartment(authBuilder.buildDepartmentResult(department));
        return details;
    }

    @Override
    public IPageData<Department> queryPage(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authBuilder.buildDepartmentQuery(departmentQuery);
        IPageData<EDepartment> data = departmentDao.queryPage(query);
        return authBuilder.buildDepartmentResult(data);
    }

    @Override
    public List<Department> queryList(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authBuilder.buildDepartmentQuery(departmentQuery);
        List<EDepartment> data = departmentDao.queryList(query);
        return authBuilder.buildDepartmentResult(data);
    }

    @Override
    public Department queryOne(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authBuilder.buildDepartmentQuery(departmentQuery);
        Optional<EDepartment> data = departmentDao.queryFirst(query);
        return authBuilder.buildDepartmentResult(data.orElse(new Department()));
    }

    @Override
    public List<Tree<Long>> listTree(DepartmentQuery query) {
        TDepartmentQuery buildDepartmentQuery = authBuilder.buildDepartmentQuery(query);
        List<EDepartment> data = departmentDao.queryList(buildDepartmentQuery);
        List<DepartmentNode> departmentNodes = authBuilder.buildDepartmentToDepartmentNode(data);
        return TreeUtil.build(departmentNodes, 0L, (object, treeNode) -> {
            BeanUtil.copyProperties(object, treeNode);
            BeanUtil.beanToMap(object).forEach(treeNode::putExtra);
        });
    }
}