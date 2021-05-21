package org.example.spring.models.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DRoleQuery extends TRoleQuery implements Serializable {

}