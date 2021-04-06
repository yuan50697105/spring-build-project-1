package org.example.modules.repository.mysql.cache;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.result.Account;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
@AllArgsConstructor
public class AccountCache {
    public static final String ACCOUNTS = "accounts";
    private final CacheManager cacheManager;

    @Async
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

    @Async
    public void putListCache(AccountQuery query, List<Account> data) {
        Cache cache = cacheManager.getCache(ACCOUNTS);
        cache.put(SecureUtil.md5(JSONUtil.toJsonStr(query)), data);
    }

    public List<Account> getListCache(AccountQuery query) {
        Cache cache = cacheManager.getCache(ACCOUNTS);
        return (List<Account>) cache.get(SecureUtil.md5(JSONUtil.toJsonStr(query)));
    }
}