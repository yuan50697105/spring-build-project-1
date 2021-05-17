package org.example.spring.daos.mysql.bill.table.vo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.po.TBillInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillInfoVo extends TBillInfo {

    public TBillInfoVo(TBillInfo TBillInfo) {
        BeanUtil.copyProperties(TBillInfo, this);
    }

    public TBillInfo toPo() {
        return BeanUtil.toBean(this, TBillInfo.class);
    }
}