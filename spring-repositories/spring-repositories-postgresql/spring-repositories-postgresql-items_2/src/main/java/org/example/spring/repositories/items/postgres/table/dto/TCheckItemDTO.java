package org.example.spring.repositories.items.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.items.postgres.table.po.TCheckItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCheckItemDTO extends TCheckItem implements Serializable {
}