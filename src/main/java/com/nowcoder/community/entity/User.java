package com.nowcoder.community.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author javaercdy
 * @create 2022-01-30$-{TIME}
 */
@Data
public class User {

    private int id;

    private String username;

    private String  password;

    private  String salt;

    private String  headerUrl;

    private String  email;

    private int type;

    private Date createTime;

    private  int  status;

    private  String activation_code;

}
