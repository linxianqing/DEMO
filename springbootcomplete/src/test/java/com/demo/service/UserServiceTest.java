//package com.demo.service;
//
//import com.demo.Application;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * Created by IntelliJ IDEA
// * User:    linxianqing
// * Date:    2017/4/12
// * Email:   linxianqinwork@qq.com
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//public class UserServiceTest {
//    @Autowired
//    private UserService userSerivce;
//
//    @Before
//    public void setUp() throws Exception {
//        // 准备，清空user表
//        userSerivce.deleteAllUsers();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void test() throws Exception {
//        // 插入5个用户
//        userSerivce.create("a", 1);
//        userSerivce.create("b", 2);
//        userSerivce.create("c", 3);
//        userSerivce.create("d", 4);
//        userSerivce.create("e", 5);
//
//        // 查数据库，应该有5个用户
//        Assert.assertEquals(5, userSerivce.getAllUsers().intValue());
//
//        // 删除两个用户
//        userSerivce.deleteByName("a");
//        userSerivce.deleteByName("e");
//
//        // 查数据库，应该有5个用户
//        Assert.assertEquals(3, userSerivce.getAllUsers().intValue());
//
//    }
//
//}