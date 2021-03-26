package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoResult extends IBaseVo {
    /**
     * 客户编号
     */
    @NotBlank
    private String code;
    /**
     * 客户类型
     */
    @NotBlank
    private String type;
    /**
     * 客户名称
     */
    @NotBlank
    private String name;
}