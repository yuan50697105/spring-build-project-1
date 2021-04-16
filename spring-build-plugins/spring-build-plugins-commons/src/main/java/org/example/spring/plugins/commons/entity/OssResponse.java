package org.example.spring.plugins.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OssResponse {
    private String fileName;
    private String bukectName;
    private String path;

}