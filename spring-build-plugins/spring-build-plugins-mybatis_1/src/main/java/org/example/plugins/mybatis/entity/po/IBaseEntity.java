package org.example.plugins.mybatis.entity.po;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;
import tk.mybatis.mapper.annotation.LogicDelete;
import tk.mybatis.mapper.annotation.Version;

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
    @TableField(updateStrategy = FieldStrategy.NEVER)
    @Column(updatable = false)
    private Date createDate = new Date();
    private Date updateDate = new Date();
    @Version
    @com.baomidou.mybatisplus.annotation.Version
    private Integer version;
    @LogicDelete
    @TableLogic
    private Integer isDelete;
}