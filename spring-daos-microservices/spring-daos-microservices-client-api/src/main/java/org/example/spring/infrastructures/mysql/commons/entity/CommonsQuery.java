package org.example.spring.infrastructures.mysql.commons.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;
import org.example.spring.plugins.commons.entity.query.OrderTypeEnum;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsQuery extends BaseQuery {
    private Integer page = 1;
    private Integer size = 20;
    private String order = "createDate";
    private OrderTypeEnum orderType;
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

    public CommonsQuery withSize(Integer size) {
        this.setSize(size);
        return this;
    }
}