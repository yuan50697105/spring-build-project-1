package org.example.spring.infrastructures.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.infrastructures.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TDepartmentDao;
import org.example.spring.infrastructures.mysql.auth.dao.TDepartmentRoleDao;
import org.example.spring.infrastructures.mysql.auth.entity.ITDepartment;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITDepartmentQuery;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartmentRole;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
@Transactional
public class TDepartmentClientImpl implements TDepartmentClient {
    private final AuthClientBuilder authClientBuilder;
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleDao departmentRoleDao;

    @Override
    @Transactional
    public void save(ITDepartment department) {
        TDepartment tDepartment = authClientBuilder.createForSave(department);
        departmentDao.save(tDepartment);
        List<TDepartmentRole> departmentRoles = authClientBuilder.createForSave(department.getRoleIds(), tDepartment.getId());
        departmentRoleDao.saveBatch(departmentRoles);
    }

    @Override
    @Transactional
    public void update(ITDepartment department) {
        Optional<TDepartment> optional = departmentDao.getByIdOpt(department.getId());
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            authClientBuilder.copy(department, tDepartment);
            departmentDao.updateById(tDepartment);
            departmentRoleDao.saveBatch(authClientBuilder.createForSave(department.getRoleIds(), tDepartment.getId()));
        }
    }


    @Override
    public void delete(List<Long> ids) {
        validateDepartment(ids);
        departmentDao.deleteByIds(ids);
        departmentRoleDao.removeByDepartmentIds(ids);
    }

    private void validateDepartment(List<Long> ids) {
        if (departmentDao.validateDelete(ids)) {
            throw new ValidationException("存在子级部门，不能删除");
        }
    }

    @Override
    public ITDepartment get(Long id) {
        TDepartment department = departmentDao.getById(id);
        return authClientBuilder.createForGetDepartment(department);
    }

    @Override
    public IPageData<ITDepartment> data(ITDepartmentQuery query) {
        IPageData<TDepartment> data = departmentDao.queryPage(authClientBuilder.createForQuery(query));
        return authClientBuilder.createForGetDepartment(data);
    }

    @Override
    public List<ITDepartment> list(ITDepartmentQuery query) {
        List<TDepartment> list = departmentDao.queryTop(authClientBuilder.createForQuery(query), query.getSize());
        return authClientBuilder.createForGetDepartment(list);
    }

    @Override
    public Optional<ITDepartment> one(ITDepartmentQuery query) {
        Optional<TDepartment> optional = departmentDao.queryFirst(authClientBuilder.createForQuery(query));
        return Optional.ofNullable(authClientBuilder.createForGetDepartment(optional.orElse(null)));
    }

}