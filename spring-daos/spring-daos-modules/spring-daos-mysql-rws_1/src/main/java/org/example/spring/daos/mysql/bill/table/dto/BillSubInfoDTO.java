package org.example.spring.daos.mysql.bill.table.dto;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.enumerate.BillSubInfoStatus;
import org.example.spring.daos.mysql.bill.table.po.BillSubInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfoDTO extends BillSubInfo {
    public BillSubInfoDTO(BillSubInfo billSubInfo) {
        BeanUtil.copyProperties(billSubInfo, this);
        setStatus(billSubInfo.getStatus());
    }

    public BillSubInfo toPo() {
        return BeanUtil.toBean(this, BillSubInfo.class);
    }

    @Override
    public String getStatus() {
        return BillSubInfoStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(BillSubInfoStatus.getName(status));
    }

}