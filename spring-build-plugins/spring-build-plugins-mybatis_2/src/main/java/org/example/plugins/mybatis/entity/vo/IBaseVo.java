package org.example.plugins.mybatis.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
public class IBaseVo extends BaseEntity {
    @NotEmpty(groups = {Update.class}, message = "ID不能为空")
    private Long id;
    @NotEmpty(groups = {Save.class}, message = "createId不能为空")
    private Long createId;
    @NotEmpty(groups = {Save.class}, message = "updateId不能为空")
    private Long updateId;
    @NotBlank(groups = {Save.class}, message = "createUser不能为空")
    private String createUser;
    @NotBlank(groups = {Update.class}, message = "updateUser不能为空")
    private String updateUser;

    public interface Save {
    }

    public interface Update {
    }


}