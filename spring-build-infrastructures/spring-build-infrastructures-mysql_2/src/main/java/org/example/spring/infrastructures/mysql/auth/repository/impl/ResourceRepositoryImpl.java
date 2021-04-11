package org.example.spring.infrastructures.mysql.auth.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.lang.tree.parser.NodeParser;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TResourceDao;
import org.example.spring.infrastructures.mysql.auth.dao.TRolePermissionDao;
import org.example.spring.infrastructures.mysql.auth.dao.UserPermissionDao;
import org.example.spring.infrastructures.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Resource;
import org.example.spring.infrastructures.mysql.auth.entity.result.PermissionDetails;
import org.example.spring.infrastructures.mysql.auth.entity.dto.ResourceNode;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
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
public class ResourceRepositoryImpl extends IBaseRepositoryImpl<Resource, PermissionFormVo, PermissionDetails, ResourceQuery> implements ResourceRepository {
    private final TResourceDao permissionDao;
    private final TRolePermissionDao rolePermissionDao;
    private final AuthBuilder authBuilder;
    private final UserPermissionDao userPermissionDao;

    @Override
    public Long saveWithId(PermissionFormVo permissionFormVo) {
        ResourceVo permission = permissionFormVo.getPermission();
        TResource entity = authBuilder.buildPermission(permission);
        permissionDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(PermissionFormVo permissionFormVo) {
        Long id = permissionFormVo.getId();
        ResourceVo permission = permissionFormVo.getPermission();
        Optional<TResource> optional = permissionDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TResource tResource = optional.get();
            authBuilder.copyPermission(permission, tResource);
            permissionDao.updateById(tResource);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        permissionDao.removeByIds(ids);
        rolePermissionDao.removeByPermissionIds(ids);
    }

    @Override
    public PermissionDetails getById(Long id) {
        PermissionDetails details = new PermissionDetails();
        details.setPermission(authBuilder.buildPermissionResult(permissionDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<Resource> queryPage(ResourceQuery resourceQuery) {
        TResourceQuery query = authBuilder.buildPermissionQuery(resourceQuery);
        IPageData<TResource> data = permissionDao.queryPage(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public List<Resource> queryList(ResourceQuery resourceQuery) {
        TResourceQuery query = authBuilder.buildPermissionQuery(resourceQuery);
        List<TResource> data = permissionDao.queryList(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public Resource queryOne(ResourceQuery resourceQuery) {
        TResourceQuery query = authBuilder.buildPermissionQuery(resourceQuery);
        TResource data = permissionDao.queryOne(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public List<Tree<Long>> listAllResourceByUserId(Long userId) {
        List<TResource> permissions = userPermissionDao.listPermissionByUserId(userId);
        List<ResourceNode> resourceNodes = authBuilder.buildPermissionToResrouceNode(permissions);
        return TreeUtil.build(resourceNodes, 0L, getNodeParser());
    }

    @Override
    public List<Tree<Long>> queryTreeList(ResourceQuery query) {
        TResourceQuery permissionQuery = authBuilder.buildPermissionQuery(query);
        List<TResource> permissions = permissionDao.queryList(permissionQuery);
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