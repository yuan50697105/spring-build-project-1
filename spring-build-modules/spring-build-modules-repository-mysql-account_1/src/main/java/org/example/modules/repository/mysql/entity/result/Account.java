package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.plugins.commons.entity.vo.IBaseVo;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends User implements Serializable {
}