package org.example.spring.infrastructures.mysql.auth.entity.dto;

import cn.hutool.core.lang.tree.TreeNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.enumerate.TResourceType;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceNode extends TreeNode<Long> {
    private String url;
    private TResourceType type;

    public String getValue() {
        return type.getValue();
    }
}