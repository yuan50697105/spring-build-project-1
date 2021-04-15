package org.example.spring.infrastructures.mysql.auth.entity.dto;

import cn.hutool.core.lang.tree.TreeNode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentNode extends TreeNode<Long> implements Serializable {

    private static final long serialVersionUID = -6000213215886155757L;
    /**
     * name
     */
    private String name;

    /**
     * code
     */
    private String code;
}