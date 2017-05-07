package com.demo.mapper;

import com.demo.entity.po.User;
import com.demo.entity.po.UserExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("UserMapper")
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}