package org.example.spring.plugins.mybatis.entity.po;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;
import org.example.spring.plugins.mybatis.audit.annotation.CreateTime;
import org.example.spring.plugins.mybatis.audit.annotation.UpdateTime;

import javax.persistence.Column;
import javax.persistence.Id;
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
    @org.example.spring.plugins.mybatis.audit.annotation.Id
    @TableId
    private Long id;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    @CreateTime
    private Date createDate;
    @UpdateTime
    private Date updateDate;
//    @Version
//    @com.baomidou.mybatisplus.annotation.Version
//    private Integer version;
//    @LogicDelete
//    @TableLogic
//    private Integer isDelete;
}