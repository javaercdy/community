package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;

import com.nowcoder.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    DiscussPostMapper discussPostMapper;


    @Test
    void contextLoads() {

    }
    @Test
    void test1(){
        System.out.println("开始-----");
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0,0,10);

        int i = discussPostMapper.selectDiscussPostRows(0);
        System.out.println("数量为:"+i);
        System.out.println("结束------");
    }

}
