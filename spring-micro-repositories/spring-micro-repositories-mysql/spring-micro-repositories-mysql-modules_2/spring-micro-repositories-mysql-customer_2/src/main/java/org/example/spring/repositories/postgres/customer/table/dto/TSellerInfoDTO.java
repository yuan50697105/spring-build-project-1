package org.example.spring.repositories.postgres.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.postgres.customer.table.po.TSellerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TSellerInfoDTO extends TSellerInfo implements Serializable {
}