package com.security.token.entity;

import com.security.token.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户实体类
 *
 * @author : OlinH
 * @version : v1.0
 * @since : 2020/10/30
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class User extends BaseEntity<User> {
    /**
     * 账号
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户全称
     */
    private String fullName;
    /**
     * 用户手机
     */
    private String mobile;

    /**
     * 用户权限，p1和p2权限
     */
    private String authorities;
}
