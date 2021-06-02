package org.example.spring.repositories.commons.bill.dto;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.bill.po.BillItemsInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillItemsInfoDTO extends BillItemsInfo {

    public BillItemsInfoDTO(BillItemsInfo BillItemsInfo) {
        BeanUtil.copyProperties(BillItemsInfo, this);
    }

    public BillItemsInfo toPo() {
        return BeanUtil.toBean(this, BillItemsInfo.class);
    }
}