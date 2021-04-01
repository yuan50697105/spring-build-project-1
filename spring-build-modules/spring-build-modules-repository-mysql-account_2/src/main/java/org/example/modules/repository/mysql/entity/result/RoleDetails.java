package org.example.modules.repository.mysql.entity.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.vo.IBaseResult;

import java.io.Serializable;
import java.util.Set;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDetails extends IBaseResult implements Serializable {
    private Role role;
    private Set<Permission> permissions;


}