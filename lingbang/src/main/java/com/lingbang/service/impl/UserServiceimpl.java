package com.lingbang.service.impl;

import com.lingbang.mapper.User;
import com.lingbang.mapper.UserCriteria;
import com.lingbang.mapper.UserMapper;
import com.lingbang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/5/4
 * Email:   linxianqinwork@qq.com
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public long countByExample(UserCriteria example) {
        return userMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserCriteria example) {
        return userMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String oid) {
        return userMapper.deleteByPrimaryKey(oid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserCriteria example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(String oid) {
        return userMapper.selectByPrimaryKey(oid);
    }

    @Override
    public int updateByExampleSelective(User record, UserCriteria example) {
        return userMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(User record, UserCriteria example) {
        return userMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
