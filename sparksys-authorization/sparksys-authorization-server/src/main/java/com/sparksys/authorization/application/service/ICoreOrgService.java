package com.sparksys.authorization.application.service;


import com.sparksys.database.base.service.SuperCacheService;
import com.sparksys.authorization.infrastructure.entity.CoreOrg;
import com.sparksys.authorization.interfaces.dto.org.OrgSaveDTO;
import com.sparksys.authorization.interfaces.dto.org.OrgUpdateDTO;

import java.util.List;

/**
 * description: 组织 服务类
 *
 * @author zhouxinlei
 * @date 2020-06-07 13:32:24
 */
public interface ICoreOrgService extends SuperCacheService<CoreOrg> {

    /**
     * 查询组织列表
     *
     * @param name 名称
     * @param status 状态
     * @return List<CoreOrg>
     */
    List<CoreOrg> getCoreOrgList(String name, Boolean status);

    /**
     * 新增组织
     *
     * @param userId     用户id
     * @param orgSaveDTO 组织保存DTO
     * @return boolean
     */
    boolean saveCoreOrg(Long userId, OrgSaveDTO orgSaveDTO);

    /**
     * 修改组织
     *
     * @param userId       用户id
     * @param orgUpdateDTO 组织更新DTO
     * @return boolean
     */
    boolean updateCoreOrg(Long userId, OrgUpdateDTO orgUpdateDTO);

    /**
     * 删除组织
     * @param id 组织id
     * @return boolean
     */
    boolean deleteCoreOrg(Long id);
}
