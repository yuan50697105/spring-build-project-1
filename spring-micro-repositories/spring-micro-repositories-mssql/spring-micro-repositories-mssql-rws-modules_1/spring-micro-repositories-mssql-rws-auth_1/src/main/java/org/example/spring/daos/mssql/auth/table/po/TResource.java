package org.example.spring.daos.mssql.auth.table.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_resource
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TResource extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    private String name;

    /**
     * type
     */
    private String type;

    /**
     * url
     */
    private String url;

    /**
     * pid
     */
    private Long pid;

    /**
     * weight
     */
    private Integer weight;
}