package org.example.spring.plugins.commons.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class ICommonsQuery extends BaseQuery {
    private Long id;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    private Date createDateStart;
    private Date createDateEnd;
    private Date createDate;
    private Date updateDate;
    private Date updateDateStart;
    private Date updateDateEnd;

}