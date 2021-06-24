package org.example.spring.repositories.auth.oracle.table.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class ResourceTreeDto extends Tree<Long> {
}