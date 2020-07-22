package com.sparksys.activiti.application.service.process;

import com.github.pagehelper.PageInfo;
import com.sparksys.activiti.infrastructure.entity.ProcessDetail;
import com.sparksys.activiti.interfaces.dto.ProcessDetailDTO;
import com.sparksys.database.dto.PageDTO;
import com.sparksys.database.service.SuperService;

import java.util.List;

/**
 * description: 流程详细节点 服务类
 *
 * @author: zhouxinlei
 * @date: 2020-07-21 14:22:03
 */
public interface IProcessDetailService extends SuperService<ProcessDetail> {

    /**
     * 查询流程节点信息
     *
     * @param modelId 模型id
     * @return List<ProcessDetailDTO>
     */
    List<ProcessDetailDTO> getProcessDetail(String modelId);

    /**
     * 分页查询流程列表
     *
     * @param pageDTO  分页参数
     * @param name     流程名称
     * @return PageInfo<ProcessDetail>
     */
    PageInfo<ProcessDetail> getProcessDetailList(PageDTO pageDTO, String name);
}