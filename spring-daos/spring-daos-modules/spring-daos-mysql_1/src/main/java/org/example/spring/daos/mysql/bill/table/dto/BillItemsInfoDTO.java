package org.example.spring.daos.mysql.bill.table.dto;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.po.BillItemsInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillItemsInfoDTO extends BillItemsInfo {

    public BillItemsInfoDTO(BillItemsInfo billItemsInfo) {
        BeanUtil.copyProperties(billItemsInfo, this);
    }

    public BillItemsInfo toPo() {
        return BeanUtil.toBean(this, BillItemsInfo.class);
    }
}