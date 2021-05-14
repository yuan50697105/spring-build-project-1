package org.example.spring.daos.mysql.bill.table.dto;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.enumerate.BillLogType;
import org.example.spring.daos.mysql.bill.table.po.BillLog;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillLogDTO extends BillLog {
    public BillLogDTO(BillLog billLog) {
        BeanUtil.copyProperties(billLog, this);
    }

    public BillLog toPo() {
        return BeanUtil.toBean(this, BillLog.class);
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