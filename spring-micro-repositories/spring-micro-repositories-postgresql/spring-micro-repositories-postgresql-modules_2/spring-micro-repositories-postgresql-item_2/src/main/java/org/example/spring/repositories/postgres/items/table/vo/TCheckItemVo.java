package org.example.spring.repositories.postgres.items.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.postgres.items.table.po.TCheckItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCheckItemVo extends TCheckItem implements Serializable {
}