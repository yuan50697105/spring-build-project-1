package org.example.modules.repository.mysql.helper;

import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.entity.vo.TAccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

@Component
public class TAccountHelper {
    @Autowired
    private TRoleDao roleDao;

    public List<Long> getRoleIdList(TAccountVo tAccountVo) {
        LinkedHashSet<Long> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(roleDao.getRoleIdListByIds(tAccountVo.getRoleIds()));
        linkedHashSet.addAll(roleDao.getRoleIdListByNames(tAccountVo.getRoleNames()));
        return new ArrayList<>(linkedHashSet);
    }
}