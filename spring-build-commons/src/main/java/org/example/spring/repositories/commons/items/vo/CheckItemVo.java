package org.example.spring.repositories.commons.items.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.items.po.CheckItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckItemVo extends CheckItem implements Serializable {
}