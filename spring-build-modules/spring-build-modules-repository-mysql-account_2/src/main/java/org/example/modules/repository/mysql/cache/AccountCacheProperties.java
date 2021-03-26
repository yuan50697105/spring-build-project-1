package org.example.modules.repository.mysql.cache;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@Data
@ConfigurationProperties(prefix = "spring.cache.account")
public class AccountCacheProperties {

    private Duration entryTtl;

    public Duration getEntryTtl() {
        return entryTtl;
    }

    public void setEntryTtl(Duration entryTtl) {
        this.entryTtl = entryTtl;
    }
}