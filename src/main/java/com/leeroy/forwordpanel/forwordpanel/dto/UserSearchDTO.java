package com.leeroy.forwordpanel.forwordpanel.dto;


import lombok.Data;

/**
 * @Title: UserSearchDTO
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/21 11:19
 */
@Data
public class UserSearchDTO extends PageRequest {
    private String username;

    private String userPhone;

    private String telegram;

    private Boolean disabled;

    private Integer id;

}
