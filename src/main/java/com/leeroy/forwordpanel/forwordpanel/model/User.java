package com.leeroy.forwordpanel.forwordpanel.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@TableName("sys_user")
@Data
public class User {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 系统用户名称
     */
    @TableField("username")
    private String username;

    /**
     * 系统用户密码
     */
    private String password;

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 手机号
     */
    private String telegram;


    /**
     * 登记时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date regTime;

    /**
     * 状态（0：无效；1：有效）
     */
    private Boolean disabled;

    /**
     * 删除表示
     */
    private Boolean deleted;

    /**
     * 用户流量限制
     */
    private Long dataLimit;

    /**
     * 流量使用量
     */
    private Long dataUsage;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 到期时间
     */
    private Date expireTime;

}
