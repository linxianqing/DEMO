package com.demo.web;

import com.demo.entity.po.User;
import com.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/4/13
 * Email:   linxianqinwork@qq.com
 */
@RestController
public class UserController1 {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping(value="/getUser", method= RequestMethod.GET)
    public User getUser() {
        return userMapper.selectByPrimaryKey(5);
    }
}
/*
*
*Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.demo.mapper.UserMapper.selectByPrimaryKey] with root cause
* APPLICATION FAILED TO START
* Consider defining a bean of type 'com.demo.com.demo.mapper.UserMapper' in your configuration.
* Field userMapper in com.demo.web.UserController1 required a bean of type 'com.demo.com.demo.mapper.UserMapper' that could not be found.
* */
