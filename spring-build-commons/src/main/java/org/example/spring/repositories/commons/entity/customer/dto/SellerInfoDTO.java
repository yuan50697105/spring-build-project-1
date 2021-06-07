package org.example.spring.repositories.commons.entity.customer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.customer.po.SellerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class SellerInfoDTO extends SellerInfo implements Serializable {
}