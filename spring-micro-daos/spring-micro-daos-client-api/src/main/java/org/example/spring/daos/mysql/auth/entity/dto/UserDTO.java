package org.example.spring.daos.mysql.auth.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.entity.vo.UserVo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDTO extends UserVo implements Serializable{


}