package com.xjm.springboot16shiro2.mapper;

import com.xjm.springboot16shiro2.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Panda
 * @create 2021-03-29 0:33
 */
@Repository
@Mapper
public interface UserMapper {

    public User queryUserByName(String name);

}
