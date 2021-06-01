package org.example.spring.daos.mssql.items.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.items.table.po.TCheckItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCheckItemDTO extends TCheckItem implements Serializable {
}