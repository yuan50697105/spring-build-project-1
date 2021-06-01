package org.example.spring.domains.repositories.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountQuery extends TUserQuery implements Serializable {

}