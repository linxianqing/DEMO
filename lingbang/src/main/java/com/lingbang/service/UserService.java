package com.lingbang.service;

import com.lingbang.mapper.User;
import com.lingbang.mapper.UserCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/5/4
 * Email:   linxianqinwork@qq.com
 */

public interface UserService {
    long countByExample(UserCriteria example);

    int deleteByExample(UserCriteria example);

    int deleteByPrimaryKey(String oid);

    int insert(User record);

    int insertSelective(User record);


    List<User> selectByExample(UserCriteria example);


    User selectByPrimaryKey(String oid);


    int updateByExampleSelective(User record, UserCriteria example);


    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
