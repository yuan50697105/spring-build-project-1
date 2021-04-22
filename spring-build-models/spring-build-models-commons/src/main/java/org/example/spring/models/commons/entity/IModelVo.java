package org.example.spring.models.commons.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import javax.validation.ValidationException;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IModelVo extends IBaseVo {

}