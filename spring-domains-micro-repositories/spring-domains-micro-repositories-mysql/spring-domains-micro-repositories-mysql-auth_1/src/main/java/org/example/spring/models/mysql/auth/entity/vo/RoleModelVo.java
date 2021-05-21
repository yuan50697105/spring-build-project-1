package org.example.spring.models.mysql.auth.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleModelVo extends ICommonsEntity {
    private static final long serialVersionUID = 8065651975886340090L;
    private String name;
    private Set<Long> resourceIds;


    public List<Long> getResourceIds() {
        return new ArrayList<>(resourceIds);
    }

    @JsonIgnore
    public TRole getRole() {
        TRole tRole = new TRole();
        tRole.setName(name);
        return tRole;
    }

}