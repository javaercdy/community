package com.nowcoder.community.controller;

import com.nowcoder.community.common.Page;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.DiscussPostService;
import com.nowcoder.community.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author javaercdy
 * @create 2022-02-05$-{TIME}
 */
@Controller
@Slf4j
public class HomeController {
    @Autowired
    DiscussPostService discussPostService;

    @Autowired
    UserService userService;

    @GetMapping(path = "/index")
    public String getIndexPage(Model model, Page page){
        try{
            int offset = page.getOffset();
            int pageSize = page.getPageSize();
            List<DiscussPost> discussPosts = discussPostService.findDiscussPosts(0, offset, pageSize);
            //设置总记录数
            int discussPostRows = discussPostService.findDiscussPostRows(0);
            page.setCountRecord(discussPostRows);
            //设置路径
            page.setPath("/index");
            List<Map<String,Object>> discussPostList = new ArrayList<>();
            discussPosts.forEach(discussPost -> {
                HashMap<String, Object> map = new HashMap<>();
                map.put("post",discussPost);
                User user = userService.getUserById(discussPost.getUserId());
                map.put("user",user);
                discussPostList.add(map);
            });
            model.addAttribute("discussPosts",discussPostList);
            model.addAttribute("page",page);
            return "index";
        }catch(Exception e){
            log.error("首页信息查询出错",e);
            return "site/error/500";
        }
    }
    @ResponseBody
    @RequestMapping("test")
    public String findAll(){
        int discussPostRows = discussPostService.findDiscussPostRows(0);
        System.out.println("数量为:"+discussPostRows);
        List<DiscussPost> discussPosts = discussPostService.findDiscussPosts(0, 0, 10);
        for (DiscussPost discussPost : discussPosts) {
            log.info("文章信息:{}",discussPost);
        }
        return "success";
    }

}
