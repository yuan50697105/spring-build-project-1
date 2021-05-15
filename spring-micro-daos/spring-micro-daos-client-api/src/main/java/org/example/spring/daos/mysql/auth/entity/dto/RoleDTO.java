package org.example.spring.daos.mysql.auth.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.entity.vo.RoleVo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDTO extends RoleVo implements Serializable {
}