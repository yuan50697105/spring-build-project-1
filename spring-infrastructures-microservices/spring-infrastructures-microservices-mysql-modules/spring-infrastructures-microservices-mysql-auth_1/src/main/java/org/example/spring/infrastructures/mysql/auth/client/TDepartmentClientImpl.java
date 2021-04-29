package org.example.spring.infrastructures.mysql.auth.client;

import cn.hutool.core.bean.BeanUtil;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.infrastructures.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TDepartmentDao;
import org.example.spring.infrastructures.mysql.auth.entity.ITDepartment;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;
import org.example.spring.infrastructures.mysql.auth.utils.CopyUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
@Transactional
public class TDepartmentClientImpl implements TDepartmentClient {
    private final AuthClientBuilder authClientBuilder;
    private final TDepartmentDao departmentDao;

    @Override
    public void save(ITDepartment department) {
        TDepartment tDepartment = authClientBuilder.createForSave(department);
        departmentDao.save(tDepartment);
    }

    @Override
    public void update(ITDepartment department) {
        Optional<TDepartment> optional = departmentDao.getByIdOpt(department.getId());
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            authClientBuilder.copy(department, tDepartment);
        }
    }
}