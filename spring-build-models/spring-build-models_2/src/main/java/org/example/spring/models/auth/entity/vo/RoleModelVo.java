package org.example.spring.models.auth.entity.vo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleModelVo extends IModelVo {
    private static final long serialVersionUID = 8065651975886340090L;
    private String name;
    private Set<Long> resourceIds;


    public List<Long> getResourceIds() {
        return new ArrayList<>(resourceIds);
    }

    public RoleVo getRole() {
        RoleVo roleVo = new RoleVo();
        roleVo.setName(name);
        return roleVo;
    }

}