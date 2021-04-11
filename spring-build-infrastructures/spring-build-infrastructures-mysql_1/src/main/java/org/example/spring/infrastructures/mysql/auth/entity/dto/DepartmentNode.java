package org.example.spring.infrastructures.mysql.auth.entity.dto;

import cn.hutool.core.lang.tree.TreeNode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentNode extends TreeNode<Long> {

    /**
     * name
     */
    private String name;

    /**
     * code
     */
    private String code;
}