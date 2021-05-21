package org.example.spring.models.mysql.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DResourceVo extends TResourceVo implements Serializable {
}