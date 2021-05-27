package org.example.spring.plugins.mybatis.entity.po;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.plugins.mybatis.audit.annotation.CreateTime;
import org.example.spring.plugins.mybatis.audit.annotation.UpdateTime;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseEntity extends ICommonsEntity implements Serializable {
    private static final long serialVersionUID = 236773490325517697L;
    @Id
    @org.example.spring.plugins.mybatis.audit.annotation.Id
    @TableId
    private Long id;
    @CreateTime
    private Date createDate;
    @UpdateTime
    private Date updateDate;

    @Override
    public void copy(Object object) {
        String[] ignoreProperties = new String[]{"id", "createDate", "updateDate"};
        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }
}