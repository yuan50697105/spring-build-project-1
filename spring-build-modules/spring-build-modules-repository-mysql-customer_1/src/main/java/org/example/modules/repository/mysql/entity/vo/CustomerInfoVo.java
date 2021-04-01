package org.example.modules.repository.mysql.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.commons.entity.vo.IBaseVo;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfoVo extends IBaseVo {
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