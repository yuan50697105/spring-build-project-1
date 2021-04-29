package org.example.spring.infrastructures.mysql.commons.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommonsEntity implements Serializable {

    private static final long serialVersionUID = 303300473375259960L;
    private Long id;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    private Date createDate;
    private Date updateDate;

}