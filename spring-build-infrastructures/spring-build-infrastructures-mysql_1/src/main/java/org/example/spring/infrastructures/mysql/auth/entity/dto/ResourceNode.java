package org.example.spring.infrastructures.mysql.auth.entity.dto;

import cn.hutool.core.lang.tree.TreeNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.enumerate.ResourceType;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceNode extends TreeNode<Long> {
    private String url;
    private String type;

    public String getValue() {
        return Optional.ofNullable(ResourceType.get(type)).map(ResourceType::getName).orElse(null);
    }
}