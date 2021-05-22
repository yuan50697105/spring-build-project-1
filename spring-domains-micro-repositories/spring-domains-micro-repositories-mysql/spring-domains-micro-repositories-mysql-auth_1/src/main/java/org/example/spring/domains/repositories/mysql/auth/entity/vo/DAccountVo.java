package org.example.spring.domains.repositories.mysql.auth.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountVo extends TUserVo {
    @Override
    @JsonIgnore
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    @JsonIgnore
    public String getName() {
        return super.getName();
    }
}