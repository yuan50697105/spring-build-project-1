package org.example.spring.plugins.mybatis.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IBaseEntity extends ICommonsEntity implements Serializable {
    private static final long serialVersionUID = 236773490325517697L;
//    @Id
//    private Long id;
//    private Long createId;
//    private Long updateId;
//    private String createUser;
//    private String updateUser;
//    @CreateTime
//    private Date createDate;
//    @UpdateTime
//    private Date updateDate;
//
//    @Override
//    public void copy(Object object) {
//        String[] ignoreProperties = new String[]{"id", "createDate", "updateDate"};
//        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
//    }
}