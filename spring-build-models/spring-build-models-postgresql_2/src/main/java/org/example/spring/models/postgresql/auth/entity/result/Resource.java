package org.example.spring.models.postgresql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.postgresql.auth.table.po.TResource;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class Resource extends TResource implements Serializable {
    private static final long serialVersionUID = 190084135795234677L;
}