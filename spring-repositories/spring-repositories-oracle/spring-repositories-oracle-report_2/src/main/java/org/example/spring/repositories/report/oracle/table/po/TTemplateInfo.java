package org.example.spring.repositories.report.mysql.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_template_info
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-report-table-po-TTemplateInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TTemplateInfo extends IBaseEntity implements Serializable {
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private Long code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * bucketName
     */
    @ApiModelProperty(value = "bucketName")
    private String bucketName;

    /**
     * fileName
     */
    @ApiModelProperty(value = "fileName")
    private String fileName;
}