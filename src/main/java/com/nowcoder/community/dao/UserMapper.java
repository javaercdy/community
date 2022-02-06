package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author javaercdy
 * @create 2022-02-05$-{TIME}
 */
@Mapper
public interface UserMapper {

    User selectUserById(int id);
}
