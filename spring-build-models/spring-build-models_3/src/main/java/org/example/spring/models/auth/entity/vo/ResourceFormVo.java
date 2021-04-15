package org.example.spring.models.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceFormVo extends IBaseVo {
    private static final long serialVersionUID = -7410245752558971359L;
    private ResourceVo permission;
}