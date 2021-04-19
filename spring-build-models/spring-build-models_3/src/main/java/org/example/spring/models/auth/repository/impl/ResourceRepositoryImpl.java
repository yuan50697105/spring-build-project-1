package org.example.spring.models.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.lang.tree.parser.NodeParser;
import lombok.AllArgsConstructor;
import org.example.spring.models.auth.builder.AuthModelBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TResourceDao;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.infrastructures.mysql.auth.dao.UserResourceDao;
import org.example.spring.models.auth.entity.query.ResourceQuery;
import org.example.spring.models.auth.entity.result.Resource;
import org.example.spring.models.auth.entity.result.ResourceDetails;
import org.example.spring.models.auth.entity.dto.ResourceNode;
import org.example.spring.models.auth.entity.vo.ResourceFormVo;
import org.example.spring.models.auth.entity.vo.ResourceVo;
import org.example.spring.models.auth.repository.ResourceRepository;
import org.example.spring.infrastructures.mysql.auth.table.po.TResource;
import org.example.spring.infrastructures.mysql.auth.table.query.TResourceQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
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
    private final AuthModelBuilder authModelBuilder;
    private final UserResourceDao userResourceDao;

    @Override
    public Long saveWithId(ResourceFormVo resourceFormVo) {
        ResourceVo permission = resourceFormVo.getPermission();
        TResource entity = authModelBuilder.buildPermission(permission);
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
            authModelBuilder.copyResource(permission, tResource);
            resourceDao.updateById(tResource);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        validateChildByIds(ids);
        resourceDao.removeByIds(ids);
        rolePermissionDao.removeByPermissionIds(ids);
    }

    @Override
    public Resource getById(Long id) {
        return authModelBuilder.buildResourceResult(resourceDao.getById(id));
    }

    private void validateChildByIds(List<Long> ids) {
        resourceDao.existChidByPids( ids);
    }

    @Override
    public ResourceDetails getDetailsById(Long id) {
        ResourceDetails details = new ResourceDetails();
        details.setResource(authModelBuilder.buildResourceResult(resourceDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<Resource> queryPage(ResourceQuery resourceQuery) {
        TResourceQuery query = authModelBuilder.buildPermissionQuery(resourceQuery);
        IPageData<TResource> data = resourceDao.queryPage(query);
        return authModelBuilder.buildResourceResult(data);
    }

    @Override
    public List<Resource> queryList(ResourceQuery resourceQuery) {
        TResourceQuery query = authModelBuilder.buildPermissionQuery(resourceQuery);
        List<TResource> data = resourceDao.queryList(query);
        return authModelBuilder.buildResourceResult(data);
    }

    @Override
    public Resource queryOne(ResourceQuery resourceQuery) {
        TResourceQuery query = authModelBuilder.buildPermissionQuery(resourceQuery);
        TResource data = resourceDao.queryOne(query);
        return authModelBuilder.buildResourceResult(data);
    }

    @Override
    public List<Tree<Long>> listAllResourceByUserId(Long userId) {
        List<TResource> permissions = userResourceDao.listPermissionByUserId(userId);
        List<ResourceNode> resourceNodes = authModelBuilder.buildPermissionToResrouceNode(permissions);
        return TreeUtil.build(resourceNodes, 0L, getNodeParser());
    }

    @Override
    public List<Tree<Long>> queryTreeList(ResourceQuery query) {
        TResourceQuery permissionQuery = authModelBuilder.buildPermissionQuery(query);
        List<TResource> permissions = resourceDao.queryList(permissionQuery);
        List<ResourceNode> resourceNodes = authModelBuilder.buildPermissionToResrouceNode(permissions);
        return TreeUtil.build(resourceNodes, 0L, getNodeParser());
    }

    private NodeParser<ResourceNode, Long> getNodeParser() {
        return (object, treeNode) -> {
            BeanUtil.copyProperties(object, treeNode);
            BeanUtil.beanToMap(object).forEach(treeNode::putExtra);
        };
    }
}