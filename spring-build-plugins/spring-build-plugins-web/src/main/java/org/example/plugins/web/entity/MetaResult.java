package org.example.plugins.web.entity;

import ai.yue.library.base.view.Result;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Data
public class MetaResult<T> extends Result<T> {
    private Meta meta;

    @Value
    public static class Meta {
        private String requestId;
        private String responseId;
    }
}