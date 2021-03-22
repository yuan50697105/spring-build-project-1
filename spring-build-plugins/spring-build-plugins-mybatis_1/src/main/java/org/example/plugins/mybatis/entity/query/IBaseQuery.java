package org.example.plugins.mybatis.entity.query;

import com.gitee.denger.mybatis.example.ext.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseQuery extends BaseEntity {
    @AndEqualTo
    private Long id;
    @AndIn(property = "id")
    private List<Long> ids;
    @AndEqualTo
    private Long createId;
    @AndEqualTo
    private Long updateId;
    @AndLike
    private String createUser;
    @AndLike
    private String updateUser;
    @AndGreaterThanOrEqualTo(property = "createDate")
    private Date createDateStart;
    @AndLessThanOrEqualTo(property = "createDate")
    private Date createDateEnd;
    @AndEqualTo
    private Integer version;
    @AndEqualTo
    private Integer isDelete;
}