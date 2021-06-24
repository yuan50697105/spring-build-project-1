package org.example.spring.repositories.auth.oracle.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.parser.NodeParser;
import org.example.spring.repositories.auth.oracle.table.dto.TResourceDTO;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;

import java.util.Map;

public class ResourceUtils {
    public static NodeParser<ResourceDTO, Long> resourceToTreeParser() {
        return (resource, tree) -> {
            tree.setParentId(resource.getPid());
            tree.setName(resource.getName());
            tree.setId(resource.getId());
            tree.setWeight(resource.getWeight());
            Map<String, Object> map = BeanUtil.beanToMap(resource);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                tree.putExtra(entry.getKey(), entry.getValue());
            }
        };
    }

    public static NodeParser<TResourceDTO, Long> tResourceToTreeParser() {
        return (resource, tree) -> {
            tree.setParentId(resource.getPid());
            tree.setName(resource.getName());
            tree.setId(resource.getId());
            tree.setWeight(resource.getWeight());
            Map<String, Object> map = BeanUtil.beanToMap(resource);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                tree.putExtra(entry.getKey(), entry.getValue());
            }
        };
    }
}