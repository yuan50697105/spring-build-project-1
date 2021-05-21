package org.example.spring.models.mysql.auth.entity.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;

import java.io.Serializable;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountDTO extends TUserDTO implements Serializable {
    @JsonIgnore
    private String password;

}
