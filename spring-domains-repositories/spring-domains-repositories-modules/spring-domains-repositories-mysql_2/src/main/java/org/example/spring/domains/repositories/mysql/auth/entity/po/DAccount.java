package org.example.spring.domains.repositories.mysql.auth.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.po.TUser;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccount extends TUser {
}