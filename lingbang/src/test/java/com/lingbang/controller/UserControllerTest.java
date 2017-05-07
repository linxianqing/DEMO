package com.lingbang.controller;

import com.LingbangApplication;
import com.lingbang.mapper.User;
import com.lingbang.service.UserService;
import com.lingbang.util.BaseUtil;
import com.lingbang.util.DataUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/5/4
 * Email:   linxianqinwork@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LingbangApplication.class)
public class UserControllerTest {
    @Autowired
    private UserService userService;
    private short a = 0;

    /**
     * 注册用户
     *
     * @throws Exception
     */
    @Test
    public void register() throws Exception {
        User user = new User();
        user.setOid(BaseUtil.getUUID());
        user.setUserId(BaseUtil.getUUID());
        user.setUsername("1099856916");
        user.setPassword("qwe111123");
        user.setName("李四");
        user.setTelno("13968758824");
        user.setPhoneno("400820337");
        user.setCreditno("330382199408090539");
        user.setAddress("浙江杭州市西湖区");
        user.setSex(a);
        user.setBirthday(DataUtil.getData());
        user.setOwnehouse("196幢5013室");
        user.setOwnepro("文新小区");
        user.setClasses(a);
        int insert = userService.insert(user);
        Assert.assertEquals(1, insert);     //状态码为1表示   插入成功
    }

}