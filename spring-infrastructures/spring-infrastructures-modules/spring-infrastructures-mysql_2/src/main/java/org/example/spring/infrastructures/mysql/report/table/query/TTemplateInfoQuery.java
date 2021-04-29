package org.example.spring.infrastructures.mysql.report.table.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TTemplateInfo extends IBaseEntity {
    private String type;
    private Long code;
    private String name;
    private String bucketName;
    private String fileName;
}