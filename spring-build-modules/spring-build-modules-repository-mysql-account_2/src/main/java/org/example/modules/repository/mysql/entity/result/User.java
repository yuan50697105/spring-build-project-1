package org.example.modules.repository.mysql.entity.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends TUser {
    @ApiModelProperty("账号")
    private String username;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("密码")
    @JsonIgnore
    private String password;
    @ApiModelProperty(value = "启用状态", notes = "0 停用，1 启用")
    private Integer enabled;
}