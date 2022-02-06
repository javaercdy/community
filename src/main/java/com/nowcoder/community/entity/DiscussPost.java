package com.nowcoder.community.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author javaercdy
 * @create 2022-01-30$-{TIME}
 */
@Data
public class DiscussPost {

    private int id;

    private int  userId;

    private String  title;

    private String content;

    private Date createTime;

    private int type;

    private int status;

    private int commentCount;

    private double score;

}
