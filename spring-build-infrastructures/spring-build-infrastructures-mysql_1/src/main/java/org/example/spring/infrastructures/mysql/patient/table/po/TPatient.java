package org.example.spring.infrastructures.mysql.patient.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_patient
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatient")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatient extends IBaseEntity implements Serializable {
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    private Long groupId;

    /**
     * groupCode
     */
    @ApiModelProperty(value = "groupCode")
    private String groupCode;

    /**
     * groupName
     */
    @ApiModelProperty(value = "groupName")
    private String groupName;

    /**
     * groupItemId
     */
    @ApiModelProperty(value = "groupItemId")
    private Long groupItemId;

    /**
     * groupItemCode
     */
    @ApiModelProperty(value = "groupItemCode")
    private String groupItemCode;

    /**
     * groupItemName
     */
    @ApiModelProperty(value = "groupItemName")
    private String groupItemName;

    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private Long customerId;

    /**
     * customerType
     */
    @ApiModelProperty(value = "customerType")
    private String customerType;

    /**
     * customerName
     */
    @ApiModelProperty(value = "customerName")
    private String customerName;

    /**
     * age
     */
    @ApiModelProperty(value = "age")
    private Integer age;

    /**
     * sex
     */
    @ApiModelProperty(value = "sex")
    private String sex;

    /**
     * marriage
     */
    @ApiModelProperty(value = "marriage")
    private String marriage;

    /**
     * bear
     */
    @ApiModelProperty(value = "bear")
    private String bear;

    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    private String phone;

    private static final long serialVersionUID = 1L;
}