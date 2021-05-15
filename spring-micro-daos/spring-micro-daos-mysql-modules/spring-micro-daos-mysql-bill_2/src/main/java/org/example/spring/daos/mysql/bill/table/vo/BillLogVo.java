package org.example.spring.daos.mysql.bill.table.vo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.enumerate.BillLogType;
import org.example.spring.daos.mysql.bill.table.po.BillLog;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillLogVo extends BillLog {
    public BillLogVo(BillLog billLog) {
        BeanUtil.copyProperties(billLog, this);
        setType(billLog.getType());
    }

    public BillLog toPo() {
        return BeanUtil.toBean(this, BillLog.class);
    }

    @Override
    public String getType() {
        return BillLogType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(BillLogType.getValue(type));
    }
}