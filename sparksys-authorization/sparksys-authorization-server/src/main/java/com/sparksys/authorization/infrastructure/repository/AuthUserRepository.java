package com.sparksys.authorization.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sparksys.database.annonation.InjectionResult;
import com.sparksys.authorization.domain.repository.IAuthUserRepository;
import com.sparksys.authorization.infrastructure.entity.AuthUser;
import com.sparksys.authorization.infrastructure.entity.RoleResource;
import com.sparksys.authorization.infrastructure.mapper.AuthUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description：用户仓储层实现类
 *
 * @author zhouxinlei
 * @date 2020/6/5 8:45 下午
 */
@Repository
public class AuthUserRepository implements IAuthUserRepository {

    @Autowired
    public AuthUserMapper authUserMapper;

    @Override
    public AuthUser selectById(Long id) {
        return authUserMapper.selectById(id);
    }

    @Override
    @InjectionResult
    public AuthUser selectByAccount(String account) {
        QueryWrapper<AuthUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account", account);
        queryWrapper.eq("status", 1);
        return authUserMapper.selectOne(queryWrapper);
    }

    @Override
    public void incrPasswordErrorNumById(Long id) {
        authUserMapper.incrPasswordErrorNumById(id);
    }

    @Override
    public List<String> getAuthUserPermissions(Long id) {
        return authUserMapper.getAuthUserPermissions(id);
    }

    @Override
    public List<String> getAuthUserRoles(Long id) {
        return authUserMapper.getAuthUserRoles(id);
    }

    @Override
    public List<RoleResource> getRoleResourceList() {
        return authUserMapper.getRoleResourceList();
    }

    @Override
    public void incrPasswordErrorNumByAccount(String account) {
        authUserMapper.incrPasswordErrorNumByAccount(account);
    }
}
