package org.example.spring.infrastructures.mysql.commons.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 303300473375259960L;
    private Long id;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    private Date createDate;
    private Date updateDate;

}