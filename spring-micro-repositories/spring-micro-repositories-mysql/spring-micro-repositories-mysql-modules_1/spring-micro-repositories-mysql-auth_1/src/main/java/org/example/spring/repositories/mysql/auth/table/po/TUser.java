package org.example.spring.repositories.mysql.auth.table.po;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.repositories.mysql.table.enumerate.TUserStatus;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * t_user
 *
 * @author yuane
 */
@ApiModel(value = "org-example-spring-daos-mysql-org.example.spring.repositories.mysql.auth-table-po-TUser")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(TUser.TABLE)
@Table(name = TUser.TABLE)
public class TUser extends IBaseEntity implements Serializable {

    public static final String TABLE = "t_user";
    private static final long serialVersionUID = 2799305908245541459L;
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
     *
     * @see TUserStatus
     */
    @ApiModelProperty(value = "状态")
    private String status;
}