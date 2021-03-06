package org.example.spring.repositories.bill.mssql.table.vo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.bill.mssql.table.po.TBillLog;
import org.example.spring.repositories.commons.enumerate.BillLogType;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillLogVo extends TBillLog {
    public TBillLogVo(TBillLog TBillLog) {
        BeanUtil.copyProperties(TBillLog, this);
        setType(TBillLog.getType());
    }

    public TBillLog toPo() {
        return BeanUtil.toBean(this, TBillLog.class);
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