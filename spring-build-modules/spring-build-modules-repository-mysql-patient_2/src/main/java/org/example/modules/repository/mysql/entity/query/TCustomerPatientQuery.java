package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.entity.po.TCustomerPatient;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_customer_patient
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerPatientQuery extends TkBaseQuery<TCustomerPatient> implements Serializable, MybatisExampleForTk<TCustomerPatient, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * customerId
     */
    @AndEqualTo
    private String customerId;
    /**
     * code
     */
    @AndLike
    private String code;
    /**
     * name
     */
    @AndLike
    private String name;
    /**
     * phone
     */
    @AndLike
    private String phone;
    /**
     * idCardNo
     */
    @AndLike
    private String idCardNo;
}