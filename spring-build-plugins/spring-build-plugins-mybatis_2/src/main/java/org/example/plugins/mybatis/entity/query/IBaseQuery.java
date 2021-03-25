package org.example.plugins.mybatis.entity.query;

import cn.hutool.core.util.ObjectUtil;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;
import org.example.plugins.mybatis.entity.OrderTypeEnum;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseQuery<E> extends BaseEntity implements MybatisExample<E>{
    private Integer page;
    private Integer size;
    private String order = "createDate";
    private OrderTypeEnum orderType = OrderTypeEnum.DESC;
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

    public void addDefault() {
        this.page = ObjectUtil.isNotEmpty(this.page) ? this.page : 1;
        this.size = ObjectUtil.isNotEmpty(this.size) ? this.size : 20;
        this.order = ObjectUtil.isNotEmpty(this.order) ? this.order : "createDate";
        this.orderType = ObjectUtil.isNotEmpty(this.orderType) ? this.orderType : OrderTypeEnum.DESC;
    }
}