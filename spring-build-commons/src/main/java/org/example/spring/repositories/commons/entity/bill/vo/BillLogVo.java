package org.example.spring.repositories.commons.entity.bill.vo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.BillLogType;
import org.example.spring.repositories.commons.entity.bill.po.BillLog;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillLogVo extends BillLog {
    public BillLogVo(BillLog BillLog) {
        BeanUtil.copyProperties(BillLog, this);
        setType(BillLog.getType());
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