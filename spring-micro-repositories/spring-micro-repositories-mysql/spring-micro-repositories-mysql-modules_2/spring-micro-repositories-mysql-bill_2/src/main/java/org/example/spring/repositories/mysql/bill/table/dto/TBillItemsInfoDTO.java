package org.example.spring.repositories.mysql.bill.table.dto;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.mysql.bill.table.po.TBillItemsInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillItemsInfoDTO extends TBillItemsInfo {

    public TBillItemsInfoDTO(TBillItemsInfo TBillItemsInfo) {
        BeanUtil.copyProperties(TBillItemsInfo, this);
    }

    public TBillItemsInfo toPo() {
        return BeanUtil.toBean(this, TBillItemsInfo.class);
    }
}