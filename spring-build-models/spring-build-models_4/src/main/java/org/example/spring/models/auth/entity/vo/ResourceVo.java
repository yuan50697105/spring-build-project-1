package org.example.spring.models.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.auth.entity.po.EResource;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceVo extends EResource {
    private static final long serialVersionUID = -4704025288591401015L;
}