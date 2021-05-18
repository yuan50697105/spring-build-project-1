package org.example.spring.daos.mysql.bill.table.vo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.BillSubInfoStatus;
import org.example.spring.daos.mysql.bill.table.po.TBillSubInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillSubInfoVo extends TBillSubInfo {
    public TBillSubInfoVo(TBillSubInfo TBillSubInfo) {
        BeanUtil.copyProperties(TBillSubInfo, this);
        setStatus(TBillSubInfo.getStatus());
    }

    public TBillSubInfo toPo() {
        return BeanUtil.toBean(this, TBillSubInfo.class);
    }

    @Override
    public String getStatus() {
        return BillSubInfoStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(BillSubInfoStatus.getValue(status));
    }
}