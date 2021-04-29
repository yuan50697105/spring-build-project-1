package org.example.spring.infrastructures.mysql.commons.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CommonsQuery {
    private Integer page = 1;
    private Integer size = 20;
    private String order = "createDate";
    private OrderTypeEnum orderType;

    public CommonsQuery withSize(Integer size) {
        this.setSize(size);
        return this;
    }
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