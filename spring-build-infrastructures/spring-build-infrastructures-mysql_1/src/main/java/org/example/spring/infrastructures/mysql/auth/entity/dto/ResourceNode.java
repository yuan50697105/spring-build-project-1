package org.example.spring.infrastructures.mysql.auth.entity.dto;

import cn.hutool.core.lang.tree.TreeNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.entity.enumerate.ResourceType;

import java.io.Serializable;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceNode extends TreeNode<Long> implements Serializable {
    private static final long serialVersionUID = 6136163946917633592L;
    private String url;
    private String type;

    public String getValue() {
        return Optional.ofNullable(ResourceType.get(type)).map(ResourceType::getName).orElse(null);
    }
}