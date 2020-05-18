package com.eidam.master.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "USER")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 2886431637003051894L;

    /**
     * 主键ID
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 电话号码
     */
    private String phoneNumber;

}
