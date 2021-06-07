package org.example.spring.repositories.commons.entity.items.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.items.po.CheckItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckItemDTO extends CheckItem implements Serializable {
}