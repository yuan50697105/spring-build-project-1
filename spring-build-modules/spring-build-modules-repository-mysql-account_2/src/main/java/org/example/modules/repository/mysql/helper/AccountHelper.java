package org.example.modules.repository.mysql.helper;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.exceptions.ValidateException;
import org.example.modules.repository.mysql.builder.AccountBuilder;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.dao.TUserRoleDao;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Component
@Transactional
public class AccountHelper {
    @Autowired
    private AccountBuilder accountBuilder;
    @Autowired
    private TUserDao userDao;
    @Autowired
    private TRoleDao roleDao;
    @Autowired
    private TUserRoleDao userRoleDao;

    public void handleUserRoleUpdate(Long id, List<Long> roleIds, List<String> roleNames) {
        List<Long> existRoleIds = roleDao.getRoleIdListByIdsOrNames(roleIds, roleNames);
        List<Long> userRoleIds = userRoleDao.getRoleIdsByUserId(id);
        Collection<Long> intersection = CollUtil.intersection(existRoleIds, userRoleIds);
        existRoleIds.removeAll(intersection);
        userRoleDao.saveBatch(accountBuilder.generateUserRoles(id, existRoleIds));
        userRoleIds.removeAll(intersection);
        userRoleDao.removeByRoleIdsAndUserId(userRoleIds, id);
    }

    public void validate(AccountFormVo accountFormVo) {
        String username = accountFormVo.getUsername();
        boolean isExist = userDao.existByUsername(username);
        if (isExist) {
            throw new ValidateException(username + "已存在");
        }
    }
}