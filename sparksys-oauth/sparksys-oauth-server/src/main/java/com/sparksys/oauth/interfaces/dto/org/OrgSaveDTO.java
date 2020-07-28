package com.sparksys.oauth.interfaces.dto.org;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

/**
 * description: 组织保存实体类
 *
 * @author: zhouxinlei
 * @date: 2020-07-28 10:21:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class OrgSaveDTO {


    @ApiModelProperty(value = "名称")
    @Length(max = 255, message = "名称长度不能超过255")
    private String label;

    @ApiModelProperty(value = "简称")
    @Length(max = 255, message = "简称长度不能超过255")
    private String abbreviation;

    @ApiModelProperty(value = "父ID")
    private Long parentId;

    @ApiModelProperty(value = "排序")
    private Integer sortValue;

    @ApiModelProperty(value = "状态")
    private Boolean status;

    @ApiModelProperty(value = "描述")
    @Length(max = 255, message = "描述长度不能超过255")
    private String describe;


}
