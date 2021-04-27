package org.example.spring.plugins.elasticsearch.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 236773490325517697L;
    @Id
    @Field
    private Long id;
    @Field
    private Long createId;
    @Field
    private Long updateId;
    @Field
    private String createUser;
    @Field
    private String updateUser;
    @Field
    private Date createDate;
    @Field
    private Date updateDate;
//    @Version
//    @com.baomidou.mybatisplus.annotation.Version
//    private Integer version;
//    @LogicDelete
//    @TableLogic
//    private Integer isDelete;
}