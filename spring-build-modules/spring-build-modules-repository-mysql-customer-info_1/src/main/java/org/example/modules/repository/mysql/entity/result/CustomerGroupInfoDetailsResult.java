package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerGroupInfoDetailsResult extends IBaseVo {
    private CustomerInfoResult customer;
    private List<StaffInfoResult> staffs;
}