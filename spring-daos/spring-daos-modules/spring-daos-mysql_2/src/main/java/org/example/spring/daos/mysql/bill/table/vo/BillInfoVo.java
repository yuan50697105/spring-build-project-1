package org.example.spring.daos.mysql.bill.table.vo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.po.BillInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillInfoVo extends BillInfo {

    public BillInfoVo(BillInfo billInfo) {
        BeanUtil.copyProperties(billInfo, this);
    }

    public BillInfo toPo() {
        return BeanUtil.toBean(this, BillInfo.class);
    }
}