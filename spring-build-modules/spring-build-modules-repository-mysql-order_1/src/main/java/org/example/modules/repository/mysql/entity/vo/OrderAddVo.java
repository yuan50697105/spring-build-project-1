package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.po.TOrderInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderAddVo extends TOrderInfo implements Serializable {
}