package org.example.spring.infrastructures.mysql.auth.entity.vo;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserVo extends TUser {
    @JsonSetter
    private String password;
}