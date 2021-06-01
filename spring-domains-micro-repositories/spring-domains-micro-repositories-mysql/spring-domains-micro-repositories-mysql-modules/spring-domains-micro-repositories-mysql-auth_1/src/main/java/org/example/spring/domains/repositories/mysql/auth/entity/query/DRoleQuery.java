package org.example.spring.domains.repositories.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.auth.table.query.TRoleQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DRoleQuery extends TRoleQuery implements Serializable {

}