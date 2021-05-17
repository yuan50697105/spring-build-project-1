package org.example.spring.daos.mysql.bill.table.dto;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.enumerate.BillLogType;
import org.example.spring.daos.mysql.bill.table.po.TBillLog;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillLogDTO extends TBillLog {
    public TBillLogDTO(TBillLog TBillLog) {
        BeanUtil.copyProperties(TBillLog, this);
        setType(TBillLog.getType());
    }

    public TBillLog toPo() {
        return BeanUtil.toBean(this, TBillLog.class);
    }

    @Override
    public String getType() {
        return BillLogType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(BillLogType.getName(type));
    }
}