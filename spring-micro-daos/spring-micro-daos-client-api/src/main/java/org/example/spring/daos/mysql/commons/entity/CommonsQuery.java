package org.example.spring.daos.mysql.commons.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsQuery extends BaseQuery {
    private Long id;
    private List<Long> ids;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    private Date createDateStart;
    private Date createDateEnd;
    private Integer version;
    private Integer isDelete;


}