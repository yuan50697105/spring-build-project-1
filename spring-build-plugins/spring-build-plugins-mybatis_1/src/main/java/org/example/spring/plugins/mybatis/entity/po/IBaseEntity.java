package org.example.spring.plugins.mybatis.entity.po;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseEntity extends BaseEntity {
    @Id
    @TableId
    private Long id;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    private Date createDate;
    private Date updateDate;
//    @Version
//    @com.baomidou.mybatisplus.annotation.Version
//    private Integer version;
//    @LogicDelete
//    @TableLogic
//    private Integer isDelete;
}