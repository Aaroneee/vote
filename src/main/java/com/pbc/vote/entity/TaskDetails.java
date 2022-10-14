package com.pbc.vote.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author Aaron
 * @since 2022-10-14
 */
@TableName("t_task_details")
@ApiModel(value="TaskDetails对象", description="")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class TaskDetails implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "任务ID")
    private Integer taskId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "德")
    private String proDe;

    @ApiModelProperty(value = "能")
    private String proNeng;

    @ApiModelProperty(value = "勤")
    private String proQin;

    @ApiModelProperty(value = "纪")
    private String proJi;

    @ApiModelProperty(value = "廉")
    private String proLian;

    @ApiModelProperty(value = "总")
    private String proCount;
}
