package com.example.boot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.example.boot.domain.TestUser")
@Data
public class TestUser implements Serializable {
    /**
    * 主键id
    */
    @ApiModelProperty(value="主键id")
    private String id;

    /**
    * 名称
    */
    @ApiModelProperty(value="名称")
    private String userName;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String userPassword;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date updateTime;

    /**
    * 删除标识（0/删除，1/未删除）
    */
    @ApiModelProperty(value="删除标识（0/删除，1/未删除）")
    private String delFlag;

    private static final long serialVersionUID = 1L;
}