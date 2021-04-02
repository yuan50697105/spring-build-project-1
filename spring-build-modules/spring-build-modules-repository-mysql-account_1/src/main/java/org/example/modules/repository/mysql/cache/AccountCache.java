package org.example.modules.repository.mysql.cache;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
@AllArgsConstructor
public class AccountCache {
    public static final String ACCOUNTS = "accounts";
    private final CacheManager cacheManager;

    public void putCache(Map<String, Object> map) {
        Cache cache = cacheManager.getCache(ACCOUNTS);
        if (ObjectUtil.isNotEmpty(map)) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                cache.put(entry.getKey(), map);
            }
        }
    }

    public Map<String, Object> getCache(String key) {
        Cache cache = cacheManager.getCache(ACCOUNTS);
        return Objects.requireNonNull(cache).get(key, Map.class);
    }
}