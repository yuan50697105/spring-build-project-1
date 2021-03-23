package org.example.plugins.mybatis.repository;

import java.util.List;

/**
 * @author yuane
 */
public interface IBaseRepository<T, V, Q> {

    void save(V v);

    void update(V v);

    void delete(List<Long> ids);
}
