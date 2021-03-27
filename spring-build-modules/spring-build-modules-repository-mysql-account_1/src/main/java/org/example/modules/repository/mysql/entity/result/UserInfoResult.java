package org.example.modules.repository.mysql.entity.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResult {
    @ApiModelProperty("账号")
    private String username;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty(value = "启用状态", notes = "0 停用，1 启用")
    private Integer enabled;
}