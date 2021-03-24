package org.example.modules.repository.mysql.helper;

import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

@Component
public class TAccountHelper {
    @Autowired
    private TRoleDao roleDao;

    public List<Long> getRoleIdList(AccountVo accountVo) {
        LinkedHashSet<Long> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(roleDao.getRoleIdListByIds(accountVo.getRoleIds()));
        linkedHashSet.addAll(roleDao.getRoleIdListByNames(accountVo.getRoleNames()));
        return new ArrayList<>(linkedHashSet);
    }
}