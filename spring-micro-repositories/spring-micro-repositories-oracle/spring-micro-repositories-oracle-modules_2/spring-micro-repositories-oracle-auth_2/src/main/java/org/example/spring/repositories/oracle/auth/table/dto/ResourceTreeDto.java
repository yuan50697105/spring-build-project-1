package org.example.spring.repositories.oracle.auth.table.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceTreeDto extends Tree<Long> {
}