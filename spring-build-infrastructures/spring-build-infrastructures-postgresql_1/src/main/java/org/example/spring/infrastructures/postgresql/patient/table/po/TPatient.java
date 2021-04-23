package org.example.spring.infrastructures.postgresql.patient.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@ApiModel(value = "org-example-spring-infrastructures-postgresql-patient-table-po-TPatient")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatient extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    private Long teamId;

    /**
     * groupCode
     */
    @ApiModelProperty(value = "groupCode")
    private String teamCode;

    /**
     * groupName
     */
    @ApiModelProperty(value = "groupName")
    private String teamName;

    /**
     * groupItemId
     */
    @ApiModelProperty(value = "groupItemId")
    private Long groupId;

    /**
     * groupItemCode
     */
    @ApiModelProperty(value = "groupItemCode")
    private String groupCode;

    /**
     * groupItemName
     */
    @ApiModelProperty(value = "groupItemName")
    private String groupName;

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
}