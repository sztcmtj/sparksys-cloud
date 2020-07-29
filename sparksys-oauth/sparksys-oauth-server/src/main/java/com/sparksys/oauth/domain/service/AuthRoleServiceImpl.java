package com.sparksys.oauth.domain.service;

import com.sparksys.database.base.service.impl.AbstractSuperCacheServiceImpl;
import com.sparksys.oauth.application.service.IAuthRoleService;
import com.sparksys.oauth.domain.repository.IAuthRoleRepository;
import com.sparksys.oauth.infrastructure.constant.CacheConstant;
import com.sparksys.oauth.infrastructure.entity.AuthRole;
import com.sparksys.oauth.infrastructure.mapper.AuthRoleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 角色 服务实现类
 *
 * @author zhouxinlei
 * @date 2020-06-07 13:37:09
 */
@Service
public class AuthRoleServiceImpl extends AbstractSuperCacheServiceImpl<AuthRoleMapper, AuthRole> implements IAuthRoleService {

    private final IAuthRoleRepository authRoleRepository;

    public AuthRoleServiceImpl(IAuthRoleRepository authRoleRepository) {
        this.authRoleRepository = authRoleRepository;
    }

    @Override
    public boolean deleteAuthRole(Long id) {
        return authRoleRepository.deleteAuthRole(id);
    }

    @Override
    public boolean updateAuthRoleStatus(Long userId, Long roleId, Boolean status) {
        AuthRole authRole = new AuthRole();
        authRole.setId(roleId);
        authRole.setStatus(status);
        authRole.setUpdateUser(userId);
        return updateById(authRole);
    }

    @Override
    protected String getRegion() {
        return CacheConstant.ROLE;
    }
}
