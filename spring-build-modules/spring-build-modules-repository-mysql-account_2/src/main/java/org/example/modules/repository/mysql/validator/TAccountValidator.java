package org.example.modules.repository.mysql.validator;

import cn.hutool.core.exceptions.ValidateException;
import org.example.modules.repository.mysql.dao.TUserDao;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuane
 */
@Component
public class TAccountValidator {
    @Autowired
    private TUserDao userDao;

    public void validate(AccountVo accountVo) {
        String username = accountVo.getUsername();
        boolean isExist = userDao.existByUsername(username);
        if (isExist) {
            throw new ValidateException(username + "已存在");
        }
    }
}