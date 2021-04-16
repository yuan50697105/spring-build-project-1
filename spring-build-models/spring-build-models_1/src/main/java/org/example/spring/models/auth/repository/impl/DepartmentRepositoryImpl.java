package org.example.spring.models.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.spring.models.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TDepartmentDao;
import org.example.spring.models.auth.entity.dto.DepartmentNode;
import org.example.spring.models.auth.entity.query.DepartmentQuery;
import org.example.spring.models.auth.entity.result.Department;
import org.example.spring.models.auth.entity.result.DepartmentDetails;
import org.example.spring.models.auth.entity.vo.DepartmentFormVo;
import org.example.spring.models.auth.entity.vo.DepartmentVo;
import org.example.spring.models.auth.repository.DepartmentRepository;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;
import org.example.spring.infrastructures.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
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
        TDepartment entity = authBuilder.buildAccountDepartment(department);
        departmentDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(DepartmentFormVo departmentFormVo) {
        Long id = departmentFormVo.getId();
        DepartmentVo department = departmentFormVo.getDepartment();
        Optional<TDepartment> optional = departmentDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            authBuilder.copyDepartment(department, tDepartment);
            departmentDao.updateById(tDepartment);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        validateChildDepartment(ids);
        departmentDao.removeByIds(ids);
    }

    @Override
    public Department getById(Long id) {
        return authBuilder.buildDepartmentResult(departmentDao.getById(id));
    }

    @SneakyThrows
    private void validateChildDepartment(List<Long> ids) {
        boolean existChildByPIds = departmentDao.existChildByPIds(ids);
        if (existChildByPIds) {
            throw new ValidationException("存在子部门使用");
        }
    }

    @Override
    public DepartmentDetails getDetailsById(Long id) {
        DepartmentDetails details = new DepartmentDetails();
        TDepartment department = departmentDao.getById(id);
        details.setDepartment(authBuilder.buildDepartmentResult(department));
        return details;
    }

    @Override
    public IPageData<Department> queryPage(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authBuilder.buildDepartmentQuery(departmentQuery);
        IPageData<TDepartment> data = departmentDao.queryPage(query);
        return authBuilder.buildDepartmentResult(data);
    }

    @Override
    public List<Department> queryList(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authBuilder.buildDepartmentQuery(departmentQuery);
        List<TDepartment> data = departmentDao.queryList(query);
        return authBuilder.buildDepartmentResult(data);
    }

    @Override
    public Department queryOne(DepartmentQuery departmentQuery) {
        TDepartmentQuery query = authBuilder.buildDepartmentQuery(departmentQuery);
        Optional<TDepartment> data = departmentDao.queryFirst(query);
        return authBuilder.buildDepartmentResult(data.orElse(new Department()));
    }

    @Override
    public List<Tree<Long>> listTree(DepartmentQuery query) {
        TDepartmentQuery buildDepartmentQuery = authBuilder.buildDepartmentQuery(query);
        List<TDepartment> data = departmentDao.queryList(buildDepartmentQuery);
        List<DepartmentNode> departmentNodes = authBuilder.buildDepartmentToDepartmentNode(data);
        return TreeUtil.build(departmentNodes, 0L, (object, treeNode) -> {
            BeanUtil.copyProperties(object, treeNode);
            BeanUtil.beanToMap(object).forEach(treeNode::putExtra);
        });
    }
}