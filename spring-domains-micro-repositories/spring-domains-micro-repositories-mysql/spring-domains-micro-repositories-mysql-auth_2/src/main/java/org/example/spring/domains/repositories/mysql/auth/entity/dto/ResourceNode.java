package org.example.spring.domains.repositories.mysql.auth.entity.dto;

import cn.hutool.core.lang.tree.TreeNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TResourceType;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceNode extends TreeNode<Long> implements Serializable {
    private static final long serialVersionUID = 6136163946917633592L;
    private String url;
    private String type;

    public String getType() {
        return TResourceType.getName(type);
    }

}