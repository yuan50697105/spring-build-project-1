package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TDepartmentDao;
import org.example.spring.daos.mysql.auth.dao.TDepartmentRoleDao;
import org.example.spring.daos.mysql.auth.entity.vo.DepartmentVo;
import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.daos.mysql.auth.table.po.TDepartment;
import org.example.spring.daos.mysql.auth.table.po.TDepartmentRole;
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
public class DepartmentDaoClientImpl implements DepartmentDaoClient {
    private final AuthClientBuilder authClientBuilder;
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleDao departmentRoleDao;

    @Override
    @Transactional
    public void save(DepartmentVo departmentVo) {
        TDepartment tDepartment = authClientBuilder.createForSave(departmentVo);
        departmentDao.save(tDepartment);
        List<TDepartmentRole> departmentRoles = authClientBuilder.createForSaveDepartmentRole(departmentVo.getRoleIds(), tDepartment.getId());
        departmentRoleDao.saveBatch(departmentRoles);
    }

    @Override
    @Transactional
    public void update(DepartmentVo departmentVo) {
        Optional<TDepartment> optional = departmentDao.getByIdOpt(departmentVo.getId());
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            authClientBuilder.copy(departmentVo, tDepartment);
            departmentDao.updateById(tDepartment);
            departmentRoleDao.saveBatch(authClientBuilder.createForSaveDepartmentRole(departmentVo.getRoleIds(), tDepartment.getId()));
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
    public DepartmentVo get(Long id) {
        TDepartment department = departmentDao.getById(id);
        return authClientBuilder.createForGetDepartment(department);
    }

    @Override
    public IPageData<DepartmentVo> data(DepartmentQuery query) {
        IPageData<TDepartment> data = departmentDao.queryPage(authClientBuilder.createForQuery(query));
        return authClientBuilder.createForGetDepartment(data);
    }

    @Override
    public List<DepartmentVo> list(DepartmentQuery query) {
        List<TDepartment> list = departmentDao.queryTop(authClientBuilder.createForQuery(query), query.getSize());
        return authClientBuilder.createForGetDepartment(list);
    }

    @Override
    public Optional<DepartmentVo> one(DepartmentQuery query) {
        Optional<TDepartment> optional = departmentDao.queryFirst(authClientBuilder.createForQuery(query));
        return Optional.ofNullable(authClientBuilder.createForGetDepartment(optional.orElse(null)));
    }

}