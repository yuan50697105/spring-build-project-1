package org.example.spring.infrastructures.mysql.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.lang.tree.parser.NodeParser;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TResourceDao;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.infrastructures.mysql.auth.dao.UserResourceDao;
import org.example.spring.infrastructures.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Resource;
import org.example.spring.infrastructures.mysql.auth.entity.result.ResourceDetails;
import org.example.spring.infrastructures.mysql.auth.entity.dto.ResourceNode;
import org.example.spring.infrastructures.mysql.auth.entity.vo.ResourceFormVo;
import org.example.spring.infrastructures.mysql.auth.entity.vo.ResourceVo;
import org.example.spring.infrastructures.mysql.auth.repository.ResourceRepository;
import org.example.spring.infrastructures.mysql.auth.table.po.TResource;
import org.example.spring.infrastructures.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class ResourceRepositoryImpl extends IBaseRepositoryImpl<Resource, ResourceFormVo, ResourceDetails, ResourceQuery> implements ResourceRepository {
    private final TResourceDao resourceDao;
    private final TRoleResourceDao rolePermissionDao;
    private final AuthBuilder authBuilder;
    private final UserResourceDao userResourceDao;

    @Override
    public Long saveWithId(ResourceFormVo resourceFormVo) {
        ResourceVo permission = resourceFormVo.getPermission();
        TResource entity = authBuilder.buildPermission(permission);
        resourceDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(ResourceFormVo resourceFormVo) {
        Long id = resourceFormVo.getId();
        ResourceVo permission = resourceFormVo.getPermission();
        Optional<TResource> optional = resourceDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TResource tResource = optional.get();
            authBuilder.copyResource(permission, tResource);
            resourceDao.updateById(tResource);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        validateChildByIds(ids);
        resourceDao.removeByIds(ids);
        rolePermissionDao.removeByPermissionIds(ids);
    }

    private void validateChildByIds(List<Long> ids) {
        resourceDao.existChidByPids( ids);
    }

    @Override
    public ResourceDetails getById(Long id) {
        ResourceDetails details = new ResourceDetails();
        details.setPermission(authBuilder.buildPermissionResult(resourceDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<Resource> queryPage(ResourceQuery resourceQuery) {
        TResourceQuery query = authBuilder.buildPermissionQuery(resourceQuery);
        IPageData<TResource> data = resourceDao.queryPage(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public List<Resource> queryList(ResourceQuery resourceQuery) {
        TResourceQuery query = authBuilder.buildPermissionQuery(resourceQuery);
        List<TResource> data = resourceDao.queryList(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public Resource queryOne(ResourceQuery resourceQuery) {
        TResourceQuery query = authBuilder.buildPermissionQuery(resourceQuery);
        TResource data = resourceDao.queryOne(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public List<Tree<Long>> listAllResourceByUserId(Long userId) {
        List<TResource> permissions = userResourceDao.listPermissionByUserId(userId);
        List<ResourceNode> resourceNodes = authBuilder.buildPermissionToResrouceNode(permissions);
        return TreeUtil.build(resourceNodes, 0L, getNodeParser());
    }

    @Override
    public List<Tree<Long>> queryTreeList(ResourceQuery query) {
        TResourceQuery permissionQuery = authBuilder.buildPermissionQuery(query);
        List<TResource> permissions = resourceDao.queryList(permissionQuery);
        List<ResourceNode> resourceNodes = authBuilder.buildPermissionToResrouceNode(permissions);
        return TreeUtil.build(resourceNodes, 0L, getNodeParser());
    }

    private NodeParser<ResourceNode, Long> getNodeParser() {
        return (object, treeNode) -> {
            BeanUtil.copyProperties(object, treeNode);
            BeanUtil.beanToMap(object).forEach(treeNode::putExtra);
        };
    }
}