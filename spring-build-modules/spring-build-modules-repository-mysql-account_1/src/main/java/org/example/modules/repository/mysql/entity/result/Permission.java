package org.example.modules.repository.mysql.entity.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.dao.TPermissionDao;
import org.example.modules.repository.mysql.entity.po.TPermission;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission extends TPermission implements Serializable {
    private Long id;
    private String name;
    private String type;
}