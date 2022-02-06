package com.nowcoder.community.service;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author javaercdy
 * @create 2022-02-05$-{TIME}
 */
public interface DiscussPostService {

    List<DiscussPost> findDiscussPosts(int userId,int offset,int limit);

    int findDiscussPostRows(int userId);
}
