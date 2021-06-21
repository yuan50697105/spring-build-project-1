package org.example.spring.repositories.mysql.auth.table.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.bind.annotation.DeleteMapping;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class ResourceTreeDto extends Tree<Long> {
}