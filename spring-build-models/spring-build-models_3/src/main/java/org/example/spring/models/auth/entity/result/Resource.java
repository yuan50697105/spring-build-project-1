package org.example.spring.models.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.auth.entity.po.EResource;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class Resource extends EResource implements Serializable {
    private static final long serialVersionUID = 190084135795234677L;
}