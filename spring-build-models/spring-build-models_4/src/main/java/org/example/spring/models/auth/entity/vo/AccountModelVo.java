package org.example.spring.models.auth.entity.vo;
import cn.hutool.core.util.ObjectUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
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

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "角色ID")
    private Set<Long> roleIds;

    public void saveValidate() throws ValidationException {
        if (ObjectUtil.isNotEmpty(username)) {
            throw new ValidationException("username 不能为空");
        }
    }

    public void setSaveDefault() {
        this.status = UserStatus.Normal.getValue();
    }

    public List<Long> getRoleIds() {
        return new ArrayList<>(roleIds);
    }

    @JsonIgnore
    public TUser getUser() {
        TUser tUser = new TUser();
        tUser.setStatus(status);
        tUser.setUsername(username);
        tUser.setName(name);
        tUser.setPassword(password);
        return tUser;
    }


}