package com.sparksys.activiti.interfaces.dto.act;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * description: 流程实例实体类
 *
 * @author: zhouxinlei
 * @date: 2020-07-27 10:04:02
 */
@Data
@ApiModel(value = "流程实例对象", description = "")
public class ProcessInstanceDTO implements Serializable {

    private static final long serialVersionUID = 1075884422700414715L;

    @ApiModelProperty(value = "流程实例id")
    private String processInstanceId;

    @ApiModelProperty(value = "业务主键")
    private String businessKey;

    @ApiModelProperty(value = "流程名称")
    private String processName;

    @ApiModelProperty(value = "流程key")
    private String processKey;

    @ApiModelProperty(value = "是否挂起")
    private Boolean suspensionState;

    @ApiModelProperty(value = "流程状态")
    private String processStatus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "业务发起人")
    private String originator;

    @ApiModelProperty(value = "完成时间")
    private LocalDateTime finishTime;

    @ApiModelProperty(value = "持续时间")
    private String dueTime;
}
