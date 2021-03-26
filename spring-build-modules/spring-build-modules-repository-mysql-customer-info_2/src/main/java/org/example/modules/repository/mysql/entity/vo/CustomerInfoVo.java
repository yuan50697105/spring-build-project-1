package org.example.modules.repository.mysql.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfoVo {
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