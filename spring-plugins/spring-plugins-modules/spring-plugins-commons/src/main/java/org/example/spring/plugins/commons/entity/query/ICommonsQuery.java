package org.example.spring.plugins.commons.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ICommonsQuery extends BaseQuery {
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