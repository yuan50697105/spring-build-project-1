package org.example.spring.models.mysql.auth.entity.vo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.util.ObjectUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.models.commons.entity.IModelVo;
import org.example.spring.models.commons.enumerate.UserStatus;

import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountModelVo extends IModelVo {
    private static final long serialVersionUID = 587049309938653406L;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "角色ID")
    private Set<Long> roleIds;

    public void saveValidate() throws ValidationException {
        if (ObjectUtil.isEmpty(getUsername())) {
            throw new ValidationException("username 不能为空");
        }
    }

    public void setSaveDefault() {

    }

    public List<Long> getRoleIds() {
        return new ArrayList<>(roleIds);
    }

    @JsonIgnore
    public TUser getUserForSave() {
        TUser tUser = new TUser();
        tUser.setStatus(UserStatus.Normal.getValue());
        tUser.setUsername(username);
        tUser.setName(name);
        tUser.setPassword(password);
        return tUser;
    }

    @JsonIgnore
    public TUser getUserForUpdate() {
        return BeanUtil.toBean(this, TUser.class, CopyOptions.create().ignoreNullValue().setIgnoreProperties("password", "username"));
    }


}